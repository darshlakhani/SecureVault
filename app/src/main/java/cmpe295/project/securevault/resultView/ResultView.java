package cmpe295.project.securevault.resultView;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import cmpe295.project.securevault.ExpandableListAdapter;
import cmpe295.project.securevault.R;
import cmpe295.project.securevault.resultView.tabview.TabPagerAdapter;


public class ResultView extends AppCompatActivity  {


    //Expandable list view instance variables   -Amogh
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    static List<String> listDataHeader;
    static HashMap<String, List<String>> listDataChild;

    //PieChart chart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_view);

        // get the listview
        //expListView = (ExpandableListView) findViewById(R.id.expandableListViewResult);

        //get char view, configure it set the data

        /*chart = (PieChart) findViewById(R.id.chart);
        ChartResult chartHandler = new ChartResult(chart,getApplicationContext());
        chartHandler.setChartConfig();
        chartHandler.setData(3, 100);*/

        // preparing list data and add it into list view
        Intent intent = getIntent();
        String resultString = intent.getStringExtra("resultJSON");
        //prepareListData(resultString);
        /*listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);
        // setting list adapter
        expListView.setAdapter(listAdapter);*/


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("Threat Overview"));
        tabLayout.addTab(tabLayout.newTab().setText("Preference View"));
        tabLayout.addTab(tabLayout.newTab().setText("VirusTotal View"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        final PagerAdapter adapter = new TabPagerAdapter
                (getSupportFragmentManager(), tabLayout.getTabCount(),resultString);
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /*
     * Preparing the list data
     */
    public static void prepareListData() {


        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Critical");
        listDataHeader.add("Warning");
        listDataHeader.add("Notice");

        // Adding child data
        List<String> top250 = new ArrayList<String>();
        top250.add("Android Debug Mode");
        top250.add("Fragment Vulnerability");
        top250.add("SSL Implementation");
        top250.add("SSL Certificate Verification");


        List<String> nowShowing = new ArrayList<String>();
        nowShowing.add("External Storage Accessing");
        nowShowing.add("Getting IMEI and Device ID");
        nowShowing.add("Getting ANDROID_ID");
        nowShowing.add("Codes for Sending SMS");
        nowShowing.add("WebView Local File Access Attacks Checking");

        List<String> comingSoon = new ArrayList<String>();
        comingSoon.add("AndroidManifest Adb Backup");
        comingSoon.add("Executing \"root\" or System Privilege");
        comingSoon.add("Android SQLite Databases Encryption");
        comingSoon.add("File Unsafe Delete");
        comingSoon.add("KeyStore File Location");

        listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
        listDataChild.put(listDataHeader.get(1), nowShowing);
        listDataChild.put(listDataHeader.get(2), comingSoon);
    }




}
