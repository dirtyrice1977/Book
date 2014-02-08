package com.mike77.app;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by mike on 2/7/14.
 */
public class HeadFragment extends Fragment {


    public HeadFragment(){
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //use layout id -- android cant find fragment from id
        return inflater.inflate(R.layout.fragment_header,container,false);
    }
}
