package com.mohammadramadan.android.findyourmovie;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class ItemsAdapter extends ArrayAdapter<Items> {

    public ItemsAdapter (Context context, ArrayList<Items> item) {
        super(context,0,item);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item_view, parent, false);
        }

        Items currentItems = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.movie_name);
        nameTextView.setText(currentItems.getmMovieName());

        TextView ratingTextView = (TextView) listItemView.findViewById(R.id.rating);
        ratingTextView.setText(currentItems.getmRating());

        TextView descriptionTextView= (TextView) listItemView.findViewById(R.id.description);
        descriptionTextView.setText(currentItems.getmDescription());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.photo);
        imageView.setImageResource(currentItems.getmImageResId());
        imageView.setVisibility(View.VISIBLE);

        return listItemView;


    }
}

