package cmpe295.project.securevault;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import okhttp3.Response;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Robin on 4/18/2016.
 */
public class DirectoryView extends AppCompatActivity implements Callback<TestResp> {
    private String path;
    ListView lvDirectory;
    DbHandler db;
    List mSelectedItems = new ArrayList();
    AlertDialog alert;
    int position2;
    String[] pref = {"Contacts", "SMS", "Camera"};
    String selected_pref ="";
    public static String API = "http://www.mocky.io";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.directory_view);

        db = new DbHandler(this);
       List<PackageInfo> apps = getPackageManager().getInstalledPackages(0);


        final ArrayList<AppInfo> res = new ArrayList<AppInfo>();
        for(int i=0;i<apps.size();i++) {
            PackageInfo p = apps.get(i);

            AppInfo newInfo = new AppInfo();
            ApplicationInfo applicationInfo = p.applicationInfo;
            if (( applicationInfo.flags & ApplicationInfo.FLAG_SYSTEM) == 1)
            {
                continue;
            }
            newInfo.appname = p.applicationInfo.loadLabel(getPackageManager()).toString();
            newInfo.pname = p.packageName;
            newInfo.versionName = p.versionName;
            newInfo.versionCode = p.versionCode;
            newInfo.icon = p.applicationInfo.loadIcon(getPackageManager());
            res.add(newInfo);

        }

        Intent it = getIntent();
        //path = "/data/app/";
        //List val1 = new ArrayList();
        //File dir = new File(path);

        //if (!dir.canRead()) {
        //    setTitle(getTitle() + " (inaccessible)");
        //}

        //String[] list = dir.list();
        //if (list != null) {
        //    for (String file : list) {
        //        if (!file.startsWith(".")) {
        //            val1.add(file);
        //        }
        //    }
        //}

        //Collections.sort(apkname);


        lvDirectory = (ListView) findViewById(R.id.lvDir);
        ArrayAdapter<AppInfo> adapter = new ApplicationListAdapter(getApplicationContext(),R.layout.application_list,res);
        lvDirectory.setAdapter(adapter);

        lvDirectory.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {


                 position2 = position;

                AlertDialog.Builder builder = new AlertDialog.Builder(DirectoryView.this);
                builder.setTitle("Select Your Preferences");

                builder.setMultiChoiceItems(pref, null, new DialogInterface.OnMultiChoiceClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                        if (isChecked) {
                            // If the user checked the item, add it to the selected items
                            mSelectedItems.add(which);
                        } else if (mSelectedItems.contains(which)) {
                            // Else, if the item is already in the array, remove it
                            mSelectedItems.remove(Integer.valueOf(which));
                        }
                    }
                });

                builder.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                    public void onClick(final DialogInterface dialog, final int id) {
                        //cancel click

                       retroapitest();

                        for (int i =0; i<mSelectedItems.size(); i++){
                            selected_pref = selected_pref +","+pref[i];
                        }
                        db.uploadApp(res.get(position2), selected_pref);
                        Intent mactivity = new Intent(DirectoryView.this, MainActivity.class);
                        startActivity(mactivity);
                        //alert.dismiss();
                    }
                });

                alert = builder.create();
                alert.show();

                Toast.makeText(getBaseContext(),String.valueOf(position+1),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onResponse(Call<TestResp> call, retrofit2.Response<TestResp> response) {
        db.updateStatus("Scanned","com.google.android.apps.docs.editors.docs");
        Intent mactivity = new Intent(DirectoryView.this, MainActivity.class);
        startActivity(mactivity);

    }

    @Override
    public void onFailure(Call<TestResp> call, Throwable t) {
        db.updateStatus("Scan Failed","com.google.android.apps.docs.editors.docs");
        Intent mactivity = new Intent(DirectoryView.this, MainActivity.class);
        startActivity(mactivity);

    }

    private void retroapitest(){
        Retrofit rt = new Retrofit.Builder()
                .baseUrl(API)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        UploadApis rtapi = rt.create(UploadApis.class);

        Call<TestResp> cl = rtapi.checkApi("test");
        cl.enqueue(this);
    }
}
