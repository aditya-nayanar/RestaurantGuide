package com.example.restaurantguide;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

//Activity pop up that displays information about crediting the images used in the app
public class PopCredits extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.credits_pop);

        DisplayMetrics d = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(d);

        int width = d.widthPixels;
        int height = d.heightPixels;

        getWindow().setLayout((int)(width*.8), (int)(height*.5));
    }
}
