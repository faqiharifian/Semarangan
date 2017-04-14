package com.arifian.udacity.semarangan.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.arifian.udacity.semarangan.fragments.BeachFragment;
import com.arifian.udacity.semarangan.fragments.FamilyFragment;
import com.arifian.udacity.semarangan.fragments.HistoryFragment;
import com.arifian.udacity.semarangan.fragments.NatureFragment;
import com.arifian.udacity.semarangan.fragments.ReligiousFragment;

/**
 * Created by faqih on 11/04/17.
 */

public class TabFragmentPagerAdapter extends FragmentPagerAdapter {
    String[] title = new String[]{
            ReligiousFragment.TITLE,
            FamilyFragment.TITLE,
            HistoryFragment.TITLE,
            NatureFragment.TITLE,
            BeachFragment.TITLE,
    };

    public TabFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new ReligiousFragment();
                break;
            case 1:
                fragment = new FamilyFragment();
                break;
            case 2:
                fragment = new HistoryFragment();
                break;
            case 3:
                fragment = new NatureFragment();
                break;
            case 4:
                fragment = new BeachFragment();
                break;
            default:
                fragment = null;
                break;
        }

        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }

    @Override
    public int getCount() {
        return title.length;
    }
}
