package com.mike77.app.Views;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.Menu;
import android.widget.ImageView;
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
        View bathroom_view = inflater.inflate(R.layout.fragment_bathroom,container,false);
        //ImageView wheel = (ImageView)bathroom_view.findViewById(R.id.wheel);

        //AnimatorSet wheelSet = (AnimatorSet) AnimatorInflater.loadAnimator(this.getActivity(), R.animator.wheel_spin);
        //wheelSet.setTarget(wheel);
        //wheelSet.start();
        //get the sun view
        //ImageView sun = (ImageView)bathroom_view.findViewById(R.id.sun);
        //load the sun movement animation
        //AnimatorSet sunSet = (AnimatorSet) AnimatorInflater.loadAnimator(this.getActivity(), R.animator.sun_swing);
        //set the view as target
        //sunSet.setTarget(sun);
        //start the animation
        //sunSet.start();

        ValueAnimator skyAnim = ObjectAnimator.ofInt
                (bathroom_view.findViewById(R.id.car_layout), "backgroundColor",
                        Color.rgb(0x66, 0xcc, 0xff), Color.rgb(0x00, 0x66, 0x99));

        skyAnim.setDuration(3000);
        skyAnim.setRepeatCount(ValueAnimator.INFINITE);
        skyAnim.setRepeatMode(ValueAnimator.REVERSE);

        skyAnim.setEvaluator(new ArgbEvaluator());

        skyAnim.start();
        return bathroom_view;
    }
}
