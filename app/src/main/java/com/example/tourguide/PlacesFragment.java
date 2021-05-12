package com.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class PlacesFragment extends Fragment {


    public PlacesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_places, container, false);

        ArrayList<Items> items = new ArrayList<Items>();
        int Name[] = {R.string.San, R.string.stanly};
        int Description[] = {R.string.San_Des, R.string.stanly_Des};
        int icon[] = {R.drawable.sanstefano, R.drawable.staneybridge};
        for (int i = 0; i < Name.length; i++) {
            items.add(new Items(Name[i], Description[i], icon[i]));
        }

        ItemsAdapter adapter = new ItemsAdapter(getActivity(), items);
        ListView listView = view.findViewById(R.id.Places_list);
        listView.setAdapter(adapter);
        return view;
    }
}
