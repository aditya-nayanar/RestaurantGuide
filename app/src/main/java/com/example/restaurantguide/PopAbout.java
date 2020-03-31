package com.example.restaurantguide;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

//Activity pop up that displays information about the purpose of the app and its key features
public class PopAbout extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_pop);

        DisplayMetrics d = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(d);

        int width = d.widthPixels;
        int height = d.heightPixels;

        getWindow().setLayout((int)(width*.75), (int)(height*.75));
    }
}
