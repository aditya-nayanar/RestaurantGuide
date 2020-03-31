package com.example.restaurantguide;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

//Activity pop up that displays information about the rating system
public class PopHelp extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help_pop);

        DisplayMetrics d = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(d);

        int width = d.widthPixels;
        int height = d.heightPixels;

        getWindow().setLayout((int)(width*.75), (int)(height*.75));
    }
}
