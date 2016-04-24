package cmpe295.project.securevault;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Robin on 4/21/2016.
 */
public class DbHandler extends SQLiteOpenHelper {

    private static final String Db_Name = "Secure_Vault";
    private static final int Db_Version = 1;
    private static final String table_name = "appsuploaded";
    private static final String key_name = "appname";
    private static final String key_status = "stat";
    private static final String key_pname = "packagename";
    private static final String key_pref = "preferences";
    SQLiteDatabase db;

    public DbHandler(Context context) {
        super(context, Db_Name, null, Db_Version);
        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String create_app_table = "CREATE TABLE  "+ table_name + " (appname TEXT, packagename TEXT UNIQUE, stat TEXT, preferences TEXT )";
        db.execSQL(create_app_table);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS"+ table_name);
    }

    public void uploadApp(AppInfo app, String pref)
    {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues vl = new ContentValues();
        Log.i("App ", app.pname);
        vl.put(key_pname, app.pname);
        vl.put(key_name, app.appname);
        vl.put(key_status, "Scanning");
        vl.put(key_pref, pref);
        Log.i("DB", pref);
        db.insert(table_name, null, vl);
        db.close();
    }

    public List<AppUploadedInfo> getAllApp()
    {
        String query = "SELECT packagename, stat, appname FROM " + table_name;
        List<AppUploadedInfo> pack = new ArrayList<>();
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cr = db.rawQuery(query, null);

        if(cr.moveToFirst()){
            do{
                AppUploadedInfo ul = new AppUploadedInfo();
                ul.pname =cr.getString(0);
                ul.status = cr.getString(1);
                ul.appname = cr.getString(2);
                pack.add(ul);
            }while (cr.moveToNext());
        }

        cr.close();
        return pack;

    }
}
