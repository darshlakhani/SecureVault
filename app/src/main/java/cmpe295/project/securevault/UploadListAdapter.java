package cmpe295.project.securevault;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Robin on 3/6/2016.
 */
public class UploadListAdapter extends ArrayAdapter<AppUploadedInfo> {
    Context context;
    List<AppUploadedInfo> ul;
    Drawable icon;
    public UploadListAdapter(Context context, int resource, List<AppUploadedInfo> objects) {
        super(context, resource, objects);
        this.context=context;
        ul = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = convertView;
        String uploadName = null;
        if (rowView == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            rowView = vi.inflate(R.layout.uploadlist_view, parent, false);
        }

        TextView tvUploadName = (TextView) rowView.findViewById(R.id.tvUploadName);
        ImageView ivUploadedImage = (ImageView) rowView.findViewById(R.id.ivUploadedImage);
        TextView tvStatus = (TextView) rowView.findViewById(R.id.tvStatus);

        if(ul != null) {
            AppUploadedInfo viewApp = ul.get(position);
            String pname = viewApp.pname;
            String appname = viewApp.appname;
            String stat = viewApp.status;

            ///from package name get AppInfo and display
            PackageManager packageManager = context.getPackageManager();
            ApplicationInfo applicationInfo;
            try {
                applicationInfo = packageManager.getApplicationInfo(pname, 0);

                icon = applicationInfo.loadIcon(context.getPackageManager());

            } catch (final PackageManager.NameNotFoundException e) {
                Log.i("UploadList", "Error");
            }

            tvUploadName.setText(appname);
            ivUploadedImage.setImageDrawable(icon);
            tvStatus.setText(stat);
        }else{
            tvUploadName.setText("No Application Uploaded");
            //ivUploadedImage.setImageDrawable();

        }
        return rowView;
    }
}
