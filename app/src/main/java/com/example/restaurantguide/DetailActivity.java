package com.example.restaurantguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

//Displays information about the restaurant
public class DetailActivity extends AppCompatActivity {

    //Initialize key values
    private static final String TAG = "DetailActivity";
    private final List<Restaurant> list = Restaurant.getRestaurants();
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Log.d(TAG, "DetailActivity onCreate Method launched");

        //receive intent from the recycler view
        Intent intent = getIntent();
        Bundle extra = intent.getExtras();
        position = extra.getInt("pos");

        //Call method to display restaurant required
        setRestaurant(position);

    }

    //Method that takes a int and displays the restaurant based on its position in the array list
    public void setRestaurant(int position){
        //Get required restaurant object
        final Restaurant r;
        r = list.get(position);

        //Find the widgets required to be updated from activity_detail
        TextView name = findViewById(R.id.dTitle);
        TextView cuisine = findViewById(R.id.dCuisine);
        TextView location = findViewById(R.id.dLocation);
        TextView description = findViewById(R.id.dDescription);
        RatingBar ratingBar = findViewById(R.id.dRatingBar);
        ImageView logo = findViewById(R.id.dLogo);
        Button map = findViewById(R.id.dMap);
        Button website = findViewById(R.id.dWebsite);
        ImageButton help = findViewById(R.id.help);

        //Set Images and Text resources with relevant values
        name.setText(r.getName());
        cuisine.setText(r.getCuisine());
        location.setText(r.getLocation());
        description.setText(r.getDescription());
        ratingBar.setRating((float)r.getRating());
        logo.setImageResource(r.getLogo());

        //Button when clicked launches google maps with the restaurant location
        map.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(r.getMap()));
                startActivity(intent);
            }
        });

        //Button when clicked launches the restaurant website
        website.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(r.getWebsite()));
                startActivity(intent);
            }
        });

        //ImageButton when clicked launches a pop up explaining the rating system
        help.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(DetailActivity.this, PopHelp.class);
                startActivity(intent);
            }
        });


    }
}

