package com.mike77.app;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import com.mike77.app.Views.LaundryFragment;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        HeadFragment header = new HeadFragment();
        FootFragment footer = new FootFragment();
        LaundryFragment laundry = new LaundryFragment();
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        //parent container to place fragment, fragment object, tag(key) to get frag
        //object(value)
        //
        transaction.add(R.id.main_container,header,"head");
        transaction.add(R.id.main_container,footer,"foot");
        transaction.add(R.id.main_container,laundry,"laundry");
        transaction.commit();


    }

}
