package com.anfaas.viewpager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.google.android.material.tabs.TabLayout;

import java.util.List;

public class ViewPagerAdapter extends PagerAdapter {

    Context context;
    LayoutInflater inflater;
    private String[] tabTitles = new String[]{"car1", "car2", "car3"};

    List<car> carList;
    public  ViewPagerAdapter(Context context,List<car> cars)
    {
        this.carList=cars;
        this.context=context;
        this.inflater=(LayoutInflater) this.context.getSystemService(this.context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {

        return  carList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {

        return  view ==(View)object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        if (position == 1) {
            View myView = inflater.inflate(R.layout.item_view_pager, container, false);
            TextView name = myView.findViewById(R.id.carName);
            ImageView imageView = myView.findViewById(R.id.carImage);
            imageView.setImageResource(this.carList.get(position).getImageId());
            name.setText(this.carList.get(position).getcar_name());
            container.addView(myView);
            return myView;
        } else {
            View myView = inflater.inflate(R.layout.item_two, container, false);
            TextView name = myView.findViewById(R.id.carName);
            ImageView imageView = myView.findViewById(R.id.carImage);
            imageView.setImageResource(this.carList.get(position).getImageId());
            name.setText(this.carList.get(position).getcar_name());
            container.addView(myView);
            return myView;
        }
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
