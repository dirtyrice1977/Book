package com.mike77.app.Views;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mike77.app.R;

/**
 * Created by mike on 2/8/14.
 */
public class BathroomFragment extends Fragment {
    public BathroomFragment(){
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_bathroom,container,false);
    }
}
