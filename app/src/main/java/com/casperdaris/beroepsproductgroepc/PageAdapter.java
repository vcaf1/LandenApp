package com.casperdaris.beroepsproductgroepc;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.casperdaris.beroepsproductgroepc.Fragments.informatieTab;
import com.casperdaris.beroepsproductgroepc.Fragments.regioTab;

public class PageAdapter extends FragmentPagerAdapter {

    private int aantalTabs;

    public PageAdapter(@NonNull FragmentManager fm, int aantalTabs) {
        super(fm);
        this.aantalTabs = aantalTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new informatieTab();
            case 1:
                return new regioTab();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return aantalTabs;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }
}
