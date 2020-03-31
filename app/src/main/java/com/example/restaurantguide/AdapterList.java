package com.example.restaurantguide;

import android.content.Context;
import android.content.Intent;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterList extends RecyclerView.Adapter<AdapterList.ListViewHolder> {
    private static final String TAG = "AdapterList";
    private final List<Restaurant> mList;
    private LayoutInflater mInflater;

    public AdapterList(Context context, List<Restaurant> list){
        mInflater = LayoutInflater.from(context);
        this.mList = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.item_view, parent, false);
        return new ListViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {

        Restaurant mCurrent = mList.get(position);

        String name = mCurrent.getName();
        String cuisine = mCurrent.getCuisine();
        double rating = mCurrent.getRating();
        int logo = mCurrent.getLogo();

        holder.name.setText(name);
        holder.cuisine.setText(cuisine);
        holder.ratingBar.setRating((float)rating);
        holder.logoImage.setImageResource(logo);

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    //ViewHolder class
    public class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public final TextView name;
        public final TextView cuisine;
        public final RatingBar ratingBar;
        public final ImageView logoImage;
        final AdapterList mAdapter;

        public ListViewHolder(@NonNull View itemView, AdapterList adapter) {
            super(itemView);
            name =itemView.findViewById(R.id.name);
            cuisine = itemView.findViewById(R.id.cuisine);
            ratingBar = itemView.findViewById(R.id.ratingBar);
            logoImage = itemView.findViewById(R.id.logo);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        //Launch DetailActivity that displays more information about the restaurant
        @Override
        public void onClick(View v) {
            Log.d(TAG, "Button Clicked");
            int position = getLayoutPosition();
            Intent intent = new Intent(v.getContext(), DetailActivity.class);
            intent.putExtra("pos", position);
            v.getContext().startActivity(intent);
        }
    }
}
