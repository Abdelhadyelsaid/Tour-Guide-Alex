package com.example.tourguide;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class SectionsPagerAdapter extends FragmentPagerAdapter {

    private final Context mContext;
    int totaltabs;

    public SectionsPagerAdapter(Context context, FragmentManager fm, int totaltabs) {
        super(fm);
        mContext = context;
        this.totaltabs = totaltabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                HistoricalFragment historicalFragment = new HistoricalFragment();
                return historicalFragment;
            case 1:
                RestaurantsFragment restaurantsFragment = new RestaurantsFragment();
                return restaurantsFragment;
            case 2:
                ParksFragment parksFragment = new ParksFragment();
                return parksFragment;
            case 3:
                PlacesFragment placesFragment = new PlacesFragment();
                return placesFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totaltabs;
    }

}