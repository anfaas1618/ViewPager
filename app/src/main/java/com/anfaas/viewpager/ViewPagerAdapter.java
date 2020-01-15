package com.anfaas.viewpager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

import com.google.android.material.tabs.TabLayout;

import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter
{

    public ViewPagerAdapter(@NonNull FragmentManager fm)
    {
        super(fm);
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        return  new BlankFragment();
    }
    @Override
    public int getCount() {
        return 3;
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
      switch (position)
      {
          case 0:
                   return "anfaas";
          case 1:
                   return "lala";
          case 2:
                   return "lmao";

      }
       return "kjh";
    }
}
