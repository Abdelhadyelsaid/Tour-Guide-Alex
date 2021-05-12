package com.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class ParksFragment extends Fragment {

    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_parks, container, false);

        ArrayList<Items> items = new ArrayList<Items>();
        int Name[] = {R.string.Alexandria_Zoo, R.string.Montaza};
        int Description[] = {R.string.Alexandria_Zoo_Des, R.string.Montaza_Des};
        int icon[] = {R.drawable.thezoo, R.drawable.montaza_palace};
        for (int i = 0; i < Name.length; i++) {
            items.add(new Items(Name[i], Description[i], icon[i]));
        }
        ItemsAdapter adapter = new ItemsAdapter(getActivity(), items);
        ListView listView = view.findViewById(R.id.Parks_list);
        listView.setAdapter(adapter);
        return view;
    }
}
