package com.mike77.app.Views;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.media.Image;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.mike77.app.R;

/**
 * Created by mike on 2/8/14.
 */
public class IntroFragment extends Fragment {
    View intro_view;
    ImageView sun;
    public IntroFragment(){
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        intro_view = inflater.inflate(R.layout.fragment_intro,container,false);
        sun = (ImageView)intro_view.findViewById(R.id.img_sun);
        sun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueAnimator sky_animation = ObjectAnimator.ofInt
                        (intro_view.findViewById(R.id.introduction), "backgroundColor",
                                Color.rgb(0x66, 0xcc, 0xff), Color.rgb(0x00, 0x66, 0x99));
                sun.setImageResource(R.drawable.moon);
                sky_animation.setDuration(4000);
                //sky_animation.setRepeatCount(ValueAnimator.RESTART);
                //sky_animation.setRepeatMode(ValueAnimator.REVERSE);

                sky_animation.setEvaluator(new ArgbEvaluator());

                sky_animation.start();
            }
        });





        return intro_view;
    }

    public void touchSun(){

    }
}
