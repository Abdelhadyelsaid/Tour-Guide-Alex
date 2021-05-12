package com.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_restaurants, container, false);

        ArrayList<Items> items = new ArrayList<Items>();
        int Name[] = {R.string.falah, R.string.Sanjofany, R.string.Azza};
        int Description[] = {R.string.falah_Des, R.string.Sanjofany_Des, R.string.Azza_Des};
        int icon[] = {R.drawable.falah, R.drawable.sanjofany, R.drawable.azza1};
        for (int i = 0; i < Name.length; i++) {
            items.add(new Items(Name[i], Description[i], icon[i]));
        }
        ItemsAdapter adapter = new ItemsAdapter(getActivity(), items);
        ListView listView = view.findViewById(R.id.restaurants_list);
        listView.setAdapter(adapter);
        return view;
    }
}
