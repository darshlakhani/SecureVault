package cmpe295.project.securevault.resultView.tabview;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
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
import cmpe295.project.securevault.resultView.detailView.CriticalDetailView;

import cmpe295.project.securevault.resultView.detailView.NoticeDetailView;
import cmpe295.project.securevault.resultView.detailView.WarningDetailView;

/**
 * Created by raoa on 4/30/2016.
 */
public class ThreatSummaryView extends Fragment {

    PieChart chart;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.threat_overview_fragment_1, container, false);


        //get char view, configure it set the data

        chart = (PieChart) v.findViewById(R.id.chart);
        ChartResult chartHandler = new ChartResult(chart,"ThreatSummary");
        chartHandler.setChartConfig();
        chartHandler.setData(3, 100);

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
        public void setData(int count, float range) {

            float mult = range;

            ArrayList<Entry> yVals1 = new ArrayList<Entry>();

            // IMPORTANT: In a PieChart, no values (Entry) should have the same
            // xIndex (even if from different DataSets), since no values can be
            // drawn above each other.
            for (int i = 0; i < count + 1; i++) {
                yVals1.add(new Entry((float) (Math.random() * mult) + mult / 5, i));
            }

            ArrayList<String> xVals = new ArrayList<String>();

            for (int i = 0; i < count + 1; i++)
                xVals.add("abcs");

            PieDataSet dataSet = new PieDataSet(yVals1, "Election Results");
            dataSet.setSliceSpace(3f);
            dataSet.setSelectionShift(5f);

            // add a lot of colors

            ArrayList<Integer> colors = new ArrayList<Integer>();

            for (int c : ColorTemplate.VORDIPLOM_COLORS)
                colors.add(c);

            for (int c : ColorTemplate.JOYFUL_COLORS)
                colors.add(c);

            for (int c : ColorTemplate.COLORFUL_COLORS)
                colors.add(c);

            for (int c : ColorTemplate.LIBERTY_COLORS)
                colors.add(c);

            for (int c : ColorTemplate.PASTEL_COLORS)
                colors.add(c);

            colors.add(ColorTemplate.getHoloBlue());

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
                case "ThreatSummary":
                    if(dataIndex == Constants.CRITICAL_INDEX){
                        // create critical details view

                        //Call ResultView activity
                        Intent intent = new Intent(getContext(), CriticalDetailView.class);

                        intent.putExtra("resultJSON", Constants.jsonStrings);
                        startActivity(intent);

                    }else if(dataIndex == Constants.WARNING_INDEX){
                        Intent intent = new Intent(getContext(), WarningDetailView.class);

                        intent.putExtra("resultJSON", Constants.jsonStrings);
                        startActivity(intent);

                    }else if(dataIndex  == Constants.NOTICE_INDEX){
                        Intent intent = new Intent(getContext(), NoticeDetailView.class);

                        intent.putExtra("resultJSON", Constants.jsonStrings);
                        startActivity(intent);

                    }
                    break;
                case "Preference":

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
