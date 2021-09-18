package com.example.whatapps_status_saver.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.whatapps_status_saver.Fragments.ImageFragment;
import com.example.whatapps_status_saver.Fragments.SavedFilesFragment;
import com.example.whatapps_status_saver.Fragments.VideoFragment;

public class PageAdapter extends FragmentPagerAdapter {

    private final int totalTabs;

    public PageAdapter(@NonNull FragmentManager fm, int totalTabs) {
        super(fm);
        this.totalTabs = totalTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        if (position == 1) {
            return new VideoFragment();
        }else if (position == 2)
            return new SavedFilesFragment();
        return new ImageFragment();

    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
