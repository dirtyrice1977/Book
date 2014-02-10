package com.mike77.app.utility;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by mike on 2/10/14.
 */
public class MyViewPager extends ViewPager {

    public boolean enabled;

    public MyViewPager(Context context) {
        super(context);
    }
    public MyViewPager(Context context, AttributeSet attributeSet)
    {
        super(context,attributeSet);
        this.enabled = true;

    }
    public boolean onTouchEvent(MotionEvent event){
        if(this.enabled){
            return super.onTouchEvent(event);
        }
        return false;
    }
    public boolean onInterceptTouchEvent(MotionEvent event)
    {
        if (this.enabled)
        {
            return super.onTouchEvent(event);
        }
        return false;
    }
    public void setPagingEnabled(boolean enabled){
        this.enabled = enabled;
    }
}
