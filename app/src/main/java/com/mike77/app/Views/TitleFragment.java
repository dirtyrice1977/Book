package com.mike77.app.Views;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mike77.app.R;

/**
 * Created by mike on 2/9/14.
 */
public class TitleFragment extends Fragment{
    public TitleFragment(){
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_title,container,false);
    }
}
