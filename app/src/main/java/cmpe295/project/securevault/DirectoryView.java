package cmpe295.project.securevault;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.preference.DialogPreference;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import org.apache.commons.io.FileUtils;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Robin on 4/18/2016.
 */
public class DirectoryView extends AppCompatActivity implements Callback<ResponseBody> {
    private String path;
    ListView lvDirectory;
    DbHandler db;
    List mSelectedItems = new ArrayList();
    AlertDialog alert;
    int position2;
    String failedPname;
    String[] pref = {"Contacts", "SMS", "Camera", "Calendar", "Location", "Microphone", "Phone", "Sensors", "Storage"};

    public static String API = "http://54.183.204.113:8081";
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



        lvDirectory = (ListView) findViewById(R.id.lvDir);
        ArrayAdapter<AppInfo> adapter = new ApplicationListAdapter(getApplicationContext(),R.layout.application_list,res);
        lvDirectory.setAdapter(adapter);

        lvDirectory.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    final int position, long id) {


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

                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(final DialogInterface dialog, final int id) {
                        //cancel click
                        String selected_pref = "";
                        for (int i = 0; i < mSelectedItems.size(); i++) {
                            selected_pref = selected_pref + "," + pref[(Integer) mSelectedItems.get(i)];
                        }
                        selected_pref = selected_pref.substring(1);
                        try {
                            retroapitest(res.get(position2).pname, selected_pref);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        if (!mSelectedItems.isEmpty()) {
                            mSelectedItems.clear();
                        }

                        db.uploadApp(res.get(position2), selected_pref);
                        failedPname = res.get(position2).pname;
                        Intent mactivity = new Intent(DirectoryView.this, MainActivity.class);
                        startActivity(mactivity);
                        //alert.dismiss();
                    }
                });

                builder.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        alert.dismiss();
                    }
                });

                alert = builder.create();
                alert.show();

                // Toast.makeText(getBaseContext(),String.valueOf(position+1),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onResponse(Call<ResponseBody> call, retrofit2.Response<ResponseBody> response) {

        String respString =" ";
        JSONObject rjson = null;
        if(response.isSuccessful()) {
            try {
                respString = response.body().string();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                rjson = new JSONObject(respString);
                db.updateThreat("Scanned", respString, rjson.getString("package_name"));
                String logCheck = db.getThreat(rjson.getString("package_name"));
                Log.i("@@@@ threat check", logCheck);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            try {
                Log.i("@@@@ json", rjson.getString("package_name"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            Log.i("@@@@ response", String.valueOf(response));
        }
        else{

        }

        Intent mactivity = new Intent(DirectoryView.this, MainActivity.class);
        startActivity(mactivity);

    }


    @Override
    public void onFailure(Call<ResponseBody> call, Throwable t) {

        //db.updateStatus("Scan Failed","com.google.android.apps.docs.editors.docs");
        Log.i("@@@@ uploadApk", String.valueOf(t));
        db.updateStatus("Scan Failed", failedPname);
        Intent mactivity = new Intent(DirectoryView.this, MainActivity.class);
        startActivity(mactivity);

    }

    private void retroapitest(String pname, String preference) throws Exception {
        Retrofit rt = new Retrofit.Builder()
                .baseUrl(API)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        UploadApis rtapi = rt.create(UploadApis.class);
        String ppath;
        String pp[];

        try{


            Process packpath = Runtime.getRuntime().exec("pm path "+pname);
            BufferedReader br = new BufferedReader(new InputStreamReader(packpath.getInputStream()));

            StringBuilder sb = new StringBuilder();
            String line;
            while((line=br.readLine())!=null){
                sb.append(line+"\n");
            }

            ppath = sb.toString().substring(8);
            Log.i("@@@@@ packpath",ppath );
            pp = ppath.split("/");
            Log.i("@@@@@ pp",pp[1]+pp[2]+pp[3] );

            packpath.waitFor();


        }catch(IOException e){
            throw new Exception(e);
        }catch(InterruptedException e){
            throw new Exception(e);
        }

        File fapk = new File("/"+pp[1]+"/"+pp[2]+"/"+pp[3]+"/base.apk");


        RequestBody reqFile = RequestBody.create(MediaType.parse("application/octet-stream; boundary=12345"), fapk);

        MultipartBody.Part body = MultipartBody.Part.createFormData("upload", fapk.getName(), reqFile);


        RequestBody description = RequestBody.create(MediaType.parse("multipart/form-data; boundary=12345"), pname);

        Call<ResponseBody> call = rtapi.uploadApk(body,preference);

        call.enqueue(this);

    }
}