package cmpe295.project.securevault.resultView.tabview;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cmpe295.project.securevault.R;

/**
 * Created by raoa on 4/30/2016.
 */
public class VirusTotalView extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        String resultJSON = getArguments().getString("resultJSON");
        return inflater.inflate(R.layout.virustotal_view_fragment_3, container, false);
    }
}