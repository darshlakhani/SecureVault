package cmpe295.project.securevault.pastePackageName;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import cmpe295.project.securevault.AppInfo;
import cmpe295.project.securevault.DbHandler;
import cmpe295.project.securevault.DirectoryView;
import cmpe295.project.securevault.MainActivity;
import cmpe295.project.securevault.R;
import cmpe295.project.securevault.UploadApis;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by raoa on 5/5/2016.
 */
public class PastePackageNameActivity  extends AppCompatActivity implements Callback<ResponseBody> {
    Button scanButton;
    EditText packageNameEditText;
    AlertDialog alert;
    DbHandler db ;
    String packageName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paste_package_name);

        scanButton = (Button)findViewById(R.id.scan);
        db =   new DbHandler(this);
        packageNameEditText = (EditText)findViewById(R.id.editText);

        scanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                String pname;
                String packageName = packageNameEditText.getText().toString();
                //check if packagename is valid
                if(isPackageNameValid(packageName)){
                     pname = packageName;
                    // check in database if results exists
                    if(isResultPresentinDB(packageName)){
                        //refresh and start main activity
                        startMainActivity();
                    }else{
                        // ask user to select preferences, make a REST call, save result in db, start main activity
                        createPrefAndSend(pname);
                    }
                }else{
                    //show error for packageName invalidity
                    packageNameEditText.setError("Invalid App Link");
                }
            }
        });
    }

    void createPrefAndSend(final String pname){
        final List mSelectedItems = new ArrayList();
        AlertDialog.Builder builder = new AlertDialog.Builder(PastePackageNameActivity.this);
        builder.setTitle("Select Your Preferences");

        builder.setMultiChoiceItems(DirectoryView.pref, null, new DialogInterface.OnMultiChoiceClickListener() {

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
                    selected_pref = selected_pref + "," + DirectoryView.pref[(Integer) mSelectedItems.get(i)];
                }
                selected_pref = selected_pref.substring(1);
                try {
                    uploadWithPackageNameAPI(pname, selected_pref);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (!mSelectedItems.isEmpty()) {
                    mSelectedItems.clear();
                }

                AppInfo appInfo = new AppInfo();
                appInfo.appname = "upload";
                appInfo.pname = pname;
                appInfo.icon = getDrawable(R.drawable.ic_playstore);
                db.uploadApp(appInfo, selected_pref);
                //failedPname = res.get(position2).pname;
                startMainActivity();
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
    }
    void startMainActivity(){
        Intent mactivity = new Intent(PastePackageNameActivity.this, MainActivity.class);
        startActivity(mactivity);
    }
    static boolean isPackageNameValid(String packageName){
        boolean result = Boolean.FALSE;

        if(packageName!=null && packageName.length() > 0){
            result = Boolean.TRUE;
            // TODO: perform more checking

        }
        return result;
    }

    boolean isResultPresentinDB(String packageName){
        return db.isRecordPresent(packageName);
    }

    void uploadWithPackageNameAPI(String packageName, String selectedPreferences){
        this.packageName = packageName;
        Retrofit rt = new Retrofit.Builder()
                .baseUrl(DirectoryView.API)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        UploadApis rtapi = rt.create(UploadApis.class);
        RequestBody pnameBody = RequestBody.create(MediaType.parse("multipart/form-data; boundary=12345"), packageName);
        RequestBody preferBody = RequestBody.create(MediaType.parse("multipart/form-data; boundary=12345"), selectedPreferences);

        Call<ResponseBody> call = rtapi.uploadWithPackageNameAPI(packageName, selectedPreferences);

        call.enqueue(this);


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
            //Log.i("@@@@ uploadApk", String.valueOf(t));
            db.updateStatus("Scan Failed", packageName);
            startMainActivity();
        }

        startMainActivity();
    }


    @Override
    public void onFailure(Call<ResponseBody> call, Throwable t) {
        Log.i("@@@@ uploadApk", String.valueOf(t));
        db.updateStatus("Scan Failed", packageName);
        startMainActivity();
    }

    }
