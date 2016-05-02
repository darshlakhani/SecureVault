package cmpe295.project.securevault.resultView.tabview;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by raoa on 4/30/2016.
 */
public class TabPagerAdapter  extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public TabPagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                ThreatSummaryView tab1 = new ThreatSummaryView();
                return tab1;
            case 1:
                PreferenceView tab2 = new PreferenceView();
                return tab2;
            case 2:
                VirusTotalView tab3 = new VirusTotalView();
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

