package cmpe295.project.securevault.resultView.detailView;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import cmpe295.project.securevault.ExpandableListAdapter;
import cmpe295.project.securevault.R;
import cmpe295.project.securevault.resultView.resultDataHelper.ThreatSummaryViewResult;
import cmpe295.project.securevault.resultView.resultDataHelper.Vector;

/**
 * Created by raoa on 5/1/2016.
 */
public class WarningDetailView extends AppCompatActivity {

    DetailViewExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    static List<String> listDataHeader;
    static HashMap<String, List<Vector>> listDataChild;
    ThreatSummaryViewResult threatSummaryViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warning_detail_view);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Warning Level Threats");
        setSupportActionBar(toolbar);
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
        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                Log.i("groupPosition:", +groupPosition + "\tchildPosition:" + childPosition);
                Vector childObject = (Vector) listAdapter.getChild(groupPosition, childPosition);
                //Toast.makeText(getApplicationContext(),childObject.getTitle(),Toast.LENGTH_LONG);


                //Create alert dialogue
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(WarningDetailView.this);

                // set title
                alertDialogBuilder.setTitle(childObject.getSummary());

                // set dialog message
                alertDialogBuilder
                        .setMessage(childObject.getTitle())
                        .setCancelable(false)

                        .setNegativeButton("Close", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // if this button is clicked, just close
                                // the dialog box and do nothing
                                dialog.cancel();
                            }
                        });

                // create alert dialog
                AlertDialog alertDialog = alertDialogBuilder.create();

                // show it
                alertDialog.show();
                return true;
            }
        });
    }

    /*
     * Preparing the list data
     */
    public  void prepareListData() {



        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<Vector>>();

        // Adding child data
        listDataHeader.add("Warning");

        // Adding child data
        List<Vector> warningList = new ArrayList<Vector>();
        for (Vector vector:threatSummaryViewResult.getWarning()){
            warningList.add(vector);
        }
        listDataChild.put(listDataHeader.get(0), warningList); // Header, Child data

    }
    class DetailViewExpandableListAdapter extends ExpandableListAdapter {
        public DetailViewExpandableListAdapter(Context context, List<String> listDataHeader,
                                               HashMap<String, List<Vector>> listChildData) {
            super(context, listDataHeader, listChildData);
        }

    }


    }