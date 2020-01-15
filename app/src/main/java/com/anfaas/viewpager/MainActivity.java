package com.anfaas.viewpager;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public  static   boolean done=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<car>
                 carList= new ArrayList<>() ;
        carList.add(new car(R.drawable.image_one,"car1"));
        carList.add(new car(R.drawable.image_two,"car2"));
        carList.add(new car(R.drawable.image_three,"car3"));
       ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(MainActivity.this,carList);
       ViewPager page=findViewById(R.id.viewPager);



        page.setAdapter(viewPagerAdapter);
    }
}
