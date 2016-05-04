package cmpe295.project.securevault.resultView.detailView;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import cmpe295.project.securevault.ExpandableListAdapter;
import cmpe295.project.securevault.R;
import cmpe295.project.securevault.resultView.resultDataHelper.ThreatSummaryViewResult;
import cmpe295.project.securevault.resultView.resultDataHelper.Vector;
import cmpe295.project.securevault.resultView.tabview.ThreatSummaryView;

/**
 * Created by raoa on 5/1/2016.
 */
public class CriticalDetailView  extends AppCompatActivity {

    DetailViewExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    static List<String> listDataHeader;
    static HashMap<String, List<Vector>> listDataChild;
    ThreatSummaryViewResult threatSummaryViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_critical_detail_view);

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
    public void prepareListData() {



        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<Vector>>();

        // Adding child data
        listDataHeader.add("Critical");

        // Adding child data
        List<Vector> criticalList = new ArrayList<Vector>();
        for (Vector vector:threatSummaryViewResult.getCritical()){
            criticalList.add(vector);
        }
        listDataChild.put(listDataHeader.get(0), criticalList); // Header, Child data

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


           /* //Create alert dialogue
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                    getApplicationContext());

            // set title
            alertDialogBuilder.setTitle(childObject.getSummary());

            // set dialog message
            alertDialogBuilder
                    .setMessage(childObject.getTitle())
                    .setCancelable(false)

                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            // if this button is clicked, just close
                            // the dialog box and do nothing
                            dialog.cancel();
                        }
                    });

            // create alert dialog
            AlertDialog alertDialog = alertDialogBuilder.create();

            // show it
            alertDialog.show();*/


            return childPosition;
        }
    }

}
