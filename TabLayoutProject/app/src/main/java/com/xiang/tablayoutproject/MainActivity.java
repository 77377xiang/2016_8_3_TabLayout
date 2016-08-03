package com.xiang.tablayoutproject;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    List<View> views = new ArrayList<>();
    PagerAdapter1 adapter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.ac_tab_layout);
        //设置字体颜色 前一个为选择，后一个选中
        tabLayout.setTabTextColors(Color.RED, Color.GREEN);
        TabLayout.Tab tab1 = tabLayout.newTab().setText("Tab1");
        tabLayout.addTab(tab1);
        TabLayout.Tab tab2 = tabLayout.newTab().setText("Tab2");
        tabLayout.addTab(tab2);
        TabLayout.Tab tab3 = tabLayout.newTab().setText("Tab3");
        tabLayout.addTab(tab3);
    }
}
