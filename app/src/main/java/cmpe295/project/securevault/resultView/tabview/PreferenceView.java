package cmpe295.project.securevault.resultView.tabview;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.PieChart;

import cmpe295.project.securevault.R;
import cmpe295.project.securevault.resultView.ChartResult;

/**
 * Created by raoa on 4/30/2016.
 */
public class PreferenceView extends Fragment {

    PieChart chart;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.preference_view_fragment_2, container, false);

        //get char view, configure it set the data

        chart = (PieChart) v.findViewById(R.id.chart);
        ChartResult chartHandler = new ChartResult(chart, "Preference");
        chartHandler.setChartConfig();
        chartHandler.setData(5, 200);
        return v;
    }
}
