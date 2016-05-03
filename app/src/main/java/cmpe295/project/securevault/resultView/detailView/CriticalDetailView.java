package cmpe295.project.securevault.resultView.detailView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import cmpe295.project.securevault.ExpandableListAdapter;
import cmpe295.project.securevault.R;

/**
 * Created by raoa on 5/1/2016.
 */
public class CriticalDetailView  extends AppCompatActivity {

    DetailViewExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    static List<String> listDataHeader;
    static HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_critical_detail_view);

        expListView = (ExpandableListView) findViewById(R.id.expandableListViewResult);
        // preparing list data and add it into list view
        Intent intent = getIntent();
        String resultString = intent.getStringExtra("resultJSON");
        prepareListData();
        listAdapter = new DetailViewExpandableListAdapter(this, listDataHeader, listDataChild);
        // setting list adapter
        expListView.setAdapter(listAdapter);
    }



    /*
     * Preparing the list data
     */
    public static void prepareListData() {



        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Critical");

        // Adding child data
        List<String> top250 = new ArrayList<String>();
        top250.add("Android Debug Mode");
        top250.add("Fragment Vulnerability");
        top250.add("SSL Implementation");
        top250.add("SSL Certificate Verification");



        listDataChild.put(listDataHeader.get(0), top250); // Header, Child data

    }

    class DetailViewExpandableListAdapter extends ExpandableListAdapter{
        public DetailViewExpandableListAdapter(Context context, List<String> listDataHeader,
                                     HashMap<String, List<String>> listChildData) {
            super(context,listDataHeader,listChildData);
        }



        @Override
        public long getChildId(int groupPosition, int childPosition) {

            System.out.println("Child Clicked "+groupPosition+" "+childPosition);
            return childPosition;
        }
    }

}
