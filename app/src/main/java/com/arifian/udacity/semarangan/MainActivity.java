package com.arifian.udacity.semarangan;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.arifian.udacity.semarangan.adapters.TabFragmentPagerAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(getString(R.string.app_name));

        ViewPager pager = (ViewPager)findViewById(R.id.pager);
        TabLayout tabs = (TabLayout)findViewById(R.id.tabs);

        pager.setAdapter(new TabFragmentPagerAdapter(getSupportFragmentManager()));

        if(Build.VERSION.SDK_INT >= 23){
            tabs.setTabTextColors(Color.BLACK,
                    getColor(android.R.color.white));
        }else {
            tabs.setTabTextColors(Color.BLACK,
                    getResources().getColor(android.R.color.white));
        }

        tabs.setupWithViewPager(pager);
    }
}
