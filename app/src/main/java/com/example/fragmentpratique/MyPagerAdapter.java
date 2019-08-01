package com.example.fragmentpratique;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.fragmentpratique.Fragment1;
import com.example.fragmentpratique.Fragment2;
import com.example.fragmentpratique.Fragment3;

public class MyPagerAdapter extends FragmentPagerAdapter {
    private static int NUM_ITEMS = 3;

    public MyPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    // Returns total number of pages
    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    // Returns the fragment to display for that page
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: // Fragment # 0 - This will show FirstFragment
                return Fragment1.newInstance( "Page # 1",0);
            case 1: // Fragment # 0 - This will show FirstFragment different title
                return Fragment2.newInstance( "Page # 2",1);
            case 2: // Fragment # 1 - This will show SecondFragment
                return Fragment3.newInstance( "Page # 3",2);
            default:
                return null;
        }
    }

    // Returns the page title for the top indicator
    @Override
    public CharSequence getPageTitle(int position) {
        return "Page " + position;
    }

}
