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
import cmpe295.project.securevault.resultView.resultDataHelper.ThreatSummaryViewResult;
import cmpe295.project.securevault.resultView.resultDataHelper.Vector;

/**
 * Created by raoa on 5/2/2016.
 */
public class NoticeDetailView extends AppCompatActivity {

    DetailViewExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    static List<String> listDataHeader;
    static HashMap<String, List<Vector>> listDataChild;
    ThreatSummaryViewResult threatSummaryViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice_detail_view);

        expListView = (ExpandableListView) findViewById(R.id.expandableListViewResult);
        // preparing list data and add it into list view
        Intent intent = getIntent();
        String resultString = intent.getStringExtra("resultJSON");

        //get formatted data from helpers
        threatSummaryViewResult = new ThreatSummaryViewResult(resultString);
        prepareListData();
        listAdapter = new DetailViewExpandableListAdapter(this, listDataHeader, listDataChild);
        // setting list adapter
        expListView.setAdapter(listAdapter);
    }

    /*
     * Preparing the list data
     */
    public  void prepareListData() {



        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<Vector>>();

        // Adding child data
        listDataHeader.add("Notice");

        // Adding child data
        List<Vector> noticeList = new ArrayList<Vector>();
        for (Vector vector:threatSummaryViewResult.getNotice()){
            noticeList.add(vector);
        }
        listDataChild.put(listDataHeader.get(0), noticeList); // Header, Child data

    }

    class DetailViewExpandableListAdapter extends ExpandableListAdapter{
        public DetailViewExpandableListAdapter(Context context, List<String> listDataHeader,
                                               HashMap<String, List<Vector>> listChildData) {
            super(context,listDataHeader,listChildData);
        }



        @Override
        public long getChildId(int groupPosition, int childPosition) {

            System.out.println("Child Clicked "+groupPosition+" "+childPosition);
            Vector childObject = (Vector)getChild(groupPosition,childPosition);
            //Toast.makeText(getApplicationContext(),childObject.getTitle(),Toast.LENGTH_LONG);
            return childPosition;
        }
    }

}
