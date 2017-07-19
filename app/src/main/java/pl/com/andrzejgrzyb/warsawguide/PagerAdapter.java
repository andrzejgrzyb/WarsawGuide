package pl.com.andrzejgrzyb.warsawguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Andrzej on 19.07.2017.
 */

public class PagerAdapter extends FragmentPagerAdapter {

    private Context mContext;
    private String[] tabNames;

    public PagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;

        tabNames = new String[] {
                mContext.getResources().getString(R.string.oldtown),
                mContext.getResources().getString(R.string.hotels),
                mContext.getResources().getString(R.string.museums),
                mContext.getResources().getString(R.string.monuments) };
    }
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = Fragment.instantiate(mContext, OldTownFragment.class.getName());
                break;
            case 1:
                fragment = Fragment.instantiate(mContext, HotelsFragment.class.getName());
                break;
            case 2:
                fragment = Fragment.instantiate(mContext, MuseumsFragment.class.getName());
                break;
            case 3:
                fragment = Fragment.instantiate(mContext, MonumentsFragment.class.getName());
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }



    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabNames[position];

    }
}
