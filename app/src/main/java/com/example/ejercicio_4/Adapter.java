package com.example.ejercicio_4;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class Adapter extends FragmentPagerAdapter {

    public Adapter(FragmentManager fm) {
        super(fm);
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment;
        switch (position) {
            case 0:
                fragment = new FirstUrlFragment();
                break;
            case 1:
                fragment = new SecondUrlFragment();
                break;
            default:
                fragment = null;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override   //to organize the tab titles
    public CharSequence getPageTitle(int position) {
        String title;
        switch (position) {
            case 0:
                title = "Web 1";
                break;
            case 1:
                title = "Web 2";
                break;
            default:
                title = " ";
        }
        return title;
    }
}
