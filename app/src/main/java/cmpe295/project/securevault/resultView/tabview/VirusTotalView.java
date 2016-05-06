package cmpe295.project.securevault.resultView.tabview;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import cmpe295.project.securevault.R;
import cmpe295.project.securevault.resultView.resultDataHelper.AntiVirusResult;
import cmpe295.project.securevault.resultView.resultDataHelper.VirusTotalViewResult;

/**
 * Created by raoa on 4/30/2016.
 */
public class VirusTotalView extends Fragment {

    ListView listView;
    VirusTotalViewResult virusTotalViewResult;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.virustotal_view_fragment_3, container, false);
        String resultJSON = getArguments().getString("resultJSON");
        virusTotalViewResult = new VirusTotalViewResult(resultJSON);

        listView = (ListView) v.findViewById(R.id.listView);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                /*Toast.makeText(getContext(),
                        "Click ListItem Number " + position, Toast.LENGTH_LONG)
                        .show();*/

            }
        });


        List<AntiVirusResult> result = virusTotalViewResult.getResults();
        String[] titleVaules = new String[result.size()];
        for (int i = 0; i < result.size(); i++){
            titleVaules[i] = result.get(i).getName();
        }

        final ListAdapter adapter = new MySimpleArrayAdapter(getContext(),virusTotalViewResult.getResults(), titleVaules);
        listView.setAdapter(adapter);
        return v;
    }



    public class MySimpleArrayAdapter extends ArrayAdapter<String> {
        private final Context context;
        private final List<AntiVirusResult> values;
        String[] titleValues;
        public MySimpleArrayAdapter(Context context, List<AntiVirusResult> values, String[] titleValues) {
            super(context, R.layout.virustotal_list_view
                    , titleValues);
            this.context = context;
            this.values = values;
            this.titleValues = titleValues;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View rowView = inflater.inflate(R.layout.virustotal_list_view, parent, false);
            TextView textView = (TextView) rowView.findViewById(R.id.firstLine);
            TextView virusNameTextView = (TextView) rowView.findViewById(R.id.secondLine);
            ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
            textView.setText(titleValues[position]);

            if(values.get(position)!=null && values.get(position).isDetected()){
                virusNameTextView.setText(values.get(position).getName());
                imageView.setImageResource(R.drawable.ic_detected);
            }else{
                virusNameTextView.setText("Not Detected");
                imageView.setImageResource(R.drawable.ic_not_detected);
            }

            return rowView;
        }
    }
}