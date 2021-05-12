package com.example.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemsAdapter extends ArrayAdapter<Items> {
    public ItemsAdapter(Context context, ArrayList<Items> items) {
        super(context, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        Items current = getItem(position);

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.fragmentdescription, parent, false);
        }
        ImageView icon = listItemView.findViewById(R.id.imageView);
        icon.setImageResource(current.getmImage());

        TextView name = listItemView.findViewById(R.id.name);
        name.setText(current.getmName());

        TextView description = listItemView.findViewById(R.id.description);
        description.setText(current.getmDescription());

        return listItemView;
    }
}
