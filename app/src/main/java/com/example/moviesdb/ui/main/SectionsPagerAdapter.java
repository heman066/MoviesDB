package com.example.moviesdb.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.moviesdb.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private final Context mContext;
    private final List<Fragment> mfragmentlist = new ArrayList<Fragment>();
    private final List<String> mfragmentTitles = new ArrayList<String>();

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }
    public void addFragment(Fragment fragment,String title){
        mfragmentlist.add(fragment);
        mfragmentTitles.add(title);
    }

    @Override
    public Fragment getItem(int position) {

        return mfragmentlist.get(position);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mfragmentTitles.get(position);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return mfragmentlist.size();
    }
}