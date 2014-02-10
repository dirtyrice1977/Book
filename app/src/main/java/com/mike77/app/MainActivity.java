package com.mike77.app;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import com.mike77.app.Views.AtticFragment;
import com.mike77.app.Views.BathroomFragment;
import com.mike77.app.Views.IntroFragment;
import com.mike77.app.Views.LaundryFragment;
import com.mike77.app.Views.TitleFragment;
import com.mike77.app.utility.MyFragmentAdapter;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        HeadFragment header = new HeadFragment();
        FootFragment footer = new FootFragment();
        //LaundryFragment laundry = new LaundryFragment();
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);


        List<Fragment> fragments = new ArrayList<Fragment>();
        fragments.add(Fragment.instantiate(this, TitleFragment.class.getName()));
        fragments.add(Fragment.instantiate(this, IntroFragment.class.getName()));
        fragments.add(Fragment.instantiate(this, LaundryFragment.class.getName()));
        fragments.add(Fragment.instantiate(this, BathroomFragment.class.getName()));
        fragments.add(Fragment.instantiate(this, AtticFragment.class.getName()));
        //parent container to place fragment, fragment object, tag(key) to get frag
        //object(value)
        //
        MyFragmentAdapter fragment_adapter = new MyFragmentAdapter(getSupportFragmentManager(), fragments);
        viewPager.setAdapter(fragment_adapter);

        //transaction.add(R.id.main_container,header,"head");
        transaction.add(R.id.main_container,footer,"foot");
        transaction.commit();


    }

}
