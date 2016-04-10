package cmpe295.project.securevault;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Robin on 3/6/2016.
 */
public class UploadListAdapter extends ArrayAdapter<String> {
    Context context;
    List<String> ul;
    public UploadListAdapter(Context context, int resource, List<String> objects) {
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
            rowView= vi.inflate(R.layout.uploadlist_view, parent, false);
        }

        TextView tvUploadName = (TextView) rowView.findViewById(R.id.tvUploadName);
        tvUploadName.setText(ul.get(position));

        return rowView;
    }
}
