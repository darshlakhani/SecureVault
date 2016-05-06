package cmpe295.project.securevault.resultView.tabview;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

import cmpe295.project.securevault.Constants;
import cmpe295.project.securevault.R;
import cmpe295.project.securevault.resultView.ChartResult;
import cmpe295.project.securevault.resultView.detailView.CriticalDetailView;
import cmpe295.project.securevault.resultView.detailView.NoticeDetailView;
import cmpe295.project.securevault.resultView.detailView.WarningDetailView;
import cmpe295.project.securevault.resultView.resultDataHelper.PreferenceViewResult;

/**
 * Created by raoa on 4/30/2016.
 */
public class PreferenceView extends Fragment {

    PieChart chart;
    String resultJSON;
    float violatedPrefPerct;
    float adheredPrefPerct;
    PreferenceViewResult preferenceViewResult;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        String resultJSON = getArguments().getString("resultJSON");
        View v =  inflater.inflate(R.layout.preference_view_fragment_2, container, false);

        //get char view, configure it set the data

        chart = (PieChart) v.findViewById(R.id.chart);
        ChartResult chartHandler = new ChartResult(chart, "Preference");
        chartHandler.setChartConfig();

        preferenceViewResult = new PreferenceViewResult(resultJSON);
        violatedPrefPerct = preferenceViewResult.getViolatedPercent();
        adheredPrefPerct =   preferenceViewResult.getAdheredPercent();

        chartHandler.setData();


        return v;
    }

    class ChartResult
            implements SeekBar.OnSeekBarChangeListener,
            OnChartValueSelectedListener {
        String chartType ;
        PieChart chart;

        public ChartResult(PieChart chart, String chartType){
            this.chart = chart;
            //this.applicationContext = applicationContext;
            // add a selection listener
            this.chart.setOnChartValueSelectedListener(this);
            this.chartType = chartType;
        }
        public void setChartConfig(){
            chart.animateY(1400, Easing.EasingOption.EaseInOutQuad);
            chart.spin(2000, 0, 360, Easing.EasingOption.EaseInOutQuad);

            Legend l = chart.getLegend();
            l.setPosition(Legend.LegendPosition.RIGHT_OF_CHART);
            l.setXEntrySpace(7f);
            l.setYEntrySpace(0f);
            l.setYOffset(0f);
        }
        public void setData() {
            ArrayList<Entry> yVals1 = new ArrayList<Entry>();

            // set yVals percentage,index
            yVals1.add(new Entry(adheredPrefPerct,0));
            yVals1.add(new Entry(violatedPrefPerct,1));


            ArrayList<String> xVals = new ArrayList<String>();

            // Label names
            xVals.add("Adhered");
            xVals.add("Violated");



            PieDataSet dataSet = new PieDataSet(yVals1, "Preferences Violation");
            dataSet.setSliceSpace(3f);
            dataSet.setSelectionShift(5f);

            // add a lot of colors

            ArrayList<Integer> colors = new ArrayList<Integer>();

            /*for (int c : ColorTemplate.VORDIPLOM_COLORS)
                colors.add(c);

            for (int c : ColorTemplate.JOYFUL_COLORS)
                colors.add(c);

            for (int c : ColorTemplate.COLORFUL_COLORS)
                colors.add(c);

            for (int c : ColorTemplate.LIBERTY_COLORS)
                colors.add(c);*/

            for (int c : ColorTemplate.PASTEL_COLORS)
                colors.add(c);

            //colors.add(ColorTemplate.getHoloBlue());

            dataSet.setColors(colors);
            //dataSet.setSelectionShift(0f);

            PieData data = new PieData(xVals, dataSet);
            data.setValueFormatter(new PercentFormatter());
            data.setValueTextSize(11f);
            data.setValueTextColor(Color.WHITE);
            //data.setValueTypeface(tf);
            chart.setData(data);

            // undo all highlights
            chart.highlightValues(null);

            chart.invalidate();
        }

        @Override
        public void onValueSelected(Entry e, int dataSetIndex, Highlight h) {

            if (e == null)
                return;


            int dataIndex = e.getXIndex();
            switch (chartType){

                case "Preference":
                    if(dataIndex == Constants.ADHERED_PREF_INDEX) {
                        //Create alert dialogue
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getContext());

                        // set title
                        alertDialogBuilder.setTitle("Preferences Adhered by App");

                        StringBuilder sb = new StringBuilder();
                        for(String s:preferenceViewResult.getAdheredPreferences()){
                            sb.append(s).append("\n");
                        }
                        // set dialog message
                        alertDialogBuilder
                                .setMessage(sb.toString())

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
                    }
                    else if(dataIndex == Constants.VIOLATED_PREF_INDEX){
                        //Create alert dialogue
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getContext());

                        // set title
                        alertDialogBuilder.setTitle("Preferences Violated by App");

                        StringBuilder sb = new StringBuilder();
                        for(String s:preferenceViewResult.getViolatedPreferences()){
                            sb.append(s).append("\n");
                        }
                        // set dialog message
                        alertDialogBuilder
                                .setMessage(sb.toString())
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


                    }

                    break;
                default:

            }

        }

        @Override
        public void onNothingSelected() {
            //Log.i("PieChart", "nothing selected");
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            // TODO Auto-generated method stub

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            // TODO Auto-generated method stub

        }

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        }





    }


}
