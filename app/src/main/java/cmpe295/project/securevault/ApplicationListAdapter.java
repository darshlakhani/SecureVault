package cmpe295.project.securevault;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.List;

/**
 * Created by Robin on 4/21/2016.
 */
public class ApplicationListAdapter extends ArrayAdapter<AppInfo> {

    Context context;
    List<AppInfo> ul;
    public ApplicationListAdapter(Context context, int resource, List<AppInfo> objects) {
        super(context, resource, objects);
        this.context=context;
        ul = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = convertView;
        String uploadName = null;
        if(rowView == null)
        {
            LayoutInflater vi ;
            vi = LayoutInflater.from(getContext());
            rowView= vi.inflate(R.layout.application_list, parent, false);
        }

        ImageView ivAppIcon = (ImageView) rowView.findViewById(R.id.ivAppImage);
        TextView tvAppName = (TextView) rowView.findViewById(R.id.tvAppName);
        AppInfo temp = ul.get(position);
        tvAppName.setText(temp.appname);
        ivAppIcon.setImageDrawable(temp.icon);

        return rowView;
    }
}
