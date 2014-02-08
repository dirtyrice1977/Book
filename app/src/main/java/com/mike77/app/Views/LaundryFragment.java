package com.mike77.app.Views;

import android.app.Fragment;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.mike77.app.R;

/**
 * Created by mike on 2/8/14.
 */

public class LaundryFragment extends Fragment{
    private Button cabinet_one;
    private Button cabinet_two;
    private Button cabinet_three;
    private Button cabinet_four;
    private Button cabinet_five;
    private Button cabinet_six;
    private Button hamper;
    private Button washer;
    private Button dryer;

    public LaundryFragment(){
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View laundry_view = inflater.inflate(R.layout.fragment_laundry,container,false);
        cabinet_one = (Button)laundry_view.findViewById(R.id.bttn_cabinet1);
        cabinet_two = (Button)laundry_view.findViewById(R.id.bttn_cabinet2);
        cabinet_three = (Button)laundry_view.findViewById(R.id.bttn_cabinet3);
        cabinet_four = (Button)laundry_view.findViewById(R.id.bttn_cabinet4);
        cabinet_five = (Button)laundry_view.findViewById(R.id.bttn_cabinet5);
        cabinet_six = (Button)laundry_view.findViewById(R.id.bttn_cabinet6);
        hamper = (Button)laundry_view.findViewById(R.id.bttn_hamper);
        washer = (Button)laundry_view.findViewById(R.id.bttn_washer);
        dryer = (Button) laundry_view.findViewById(R.id.bttn_dryer);

        return laundry_view;
    }


    public void changeCabinet(View the_view)
    {

    }


}
