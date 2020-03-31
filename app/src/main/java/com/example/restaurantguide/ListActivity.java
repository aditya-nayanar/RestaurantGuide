package com.example.restaurantguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

public class ListActivity extends AppCompatActivity {

    private RecyclerView restaurantList;
    private AdapterList rAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private final List<Restaurant> restaurants = Restaurant.getRestaurants();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


        //Find the Recycler view widget
        restaurantList = findViewById(R.id.restaurantList);

        //Create a new adapter linked to stored restaurant list
        rAdapter = new AdapterList(this, restaurants);

        //Set the adapter to the Recycler View
        restaurantList.setAdapter(rAdapter);

        //Set a default layout manager to the restaurant list view
        restaurantList.setLayoutManager(new LinearLayoutManager(this));


    }
}
