package cmpe295.project.securevault.resultView.tabview;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by raoa on 4/30/2016.
 */
public class TabPagerAdapter  extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    String resultJSON ;
    Bundle bundle ;

    public TabPagerAdapter(FragmentManager fm, int NumOfTabs, String resultJSON) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
        this.resultJSON  = resultJSON;

        bundle = new Bundle();
        bundle.putString("resultJSON", resultJSON);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                ThreatSummaryView tab1 = new ThreatSummaryView();
                tab1.setArguments(bundle);
                return tab1;
            case 1:
                PreferenceView tab2 = new PreferenceView();
                tab2.setArguments(bundle);
                return tab2;
            case 2:
                VirusTotalView tab3 = new VirusTotalView();
                tab3.setArguments(bundle);
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}

