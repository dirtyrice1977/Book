package com.mike77.app.Views;


import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.mike77.app.R;
import com.mike77.app.utility.MyImageView;

/**
 * Created by mike on 2/8/14.
 */

public class LaundryFragment extends Fragment {
    private ImageView cabinet_one;
    private ImageView cabinet_three;
    private ImageView cabinet_five;
    private ImageView hamper;
    private ImageView washer;
    private ImageView dryer;
    public LaundryFragment(){
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View laundry_view = inflater.inflate(R.layout.fragment_laundry,container,false);
        cabinet_one = (ImageView)laundry_view.findViewById(R.id.img_cabinet1);
        cabinet_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cabinet_one.setImageResource(R.drawable.open_cabinet);
            }
        });
        cabinet_three = (MyImageView)laundry_view.findViewById(R.id.img_cabinet3);
        cabinet_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cabinet_three.setImageResource(R.drawable.open_cabinet);
            }
        });
        cabinet_five = (MyImageView)laundry_view.findViewById(R.id.img_cabinet5);
        cabinet_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cabinet_five.setImageResource(R.drawable.open_cabinet);
            }
        });
        hamper = (MyImageView)laundry_view.findViewById(R.id.img_hamper);
        washer = (MyImageView)laundry_view.findViewById(R.id.img_washer);
        dryer = (MyImageView) laundry_view.findViewById(R.id.img_dryer);
        return laundry_view;
    }



}
