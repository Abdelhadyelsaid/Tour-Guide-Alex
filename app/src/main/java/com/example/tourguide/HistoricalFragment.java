package com.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoricalFragment extends Fragment {

    public HistoricalFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_historical, container, false);

        ArrayList<Items> items = new ArrayList<Items>();
        int Name[] = {R.string.Qaitbay_Citadel, R.string.Morsy_Mosque};
        int Description[] = {R.string.Qaitbay_Citadel_Des, R.string.Morsy_Mosque_Des};
        int icon[] = {R.drawable.qaitbay, R.drawable.morsy};
        for (int i = 0; i < Name.length; i++) {
            items.add(new Items(Name[i], Description[i], icon[i]));
        }
        ItemsAdapter adapter = new ItemsAdapter(getActivity(), items);
        ListView listView = view.findViewById(R.id.historical_list);
        listView.setAdapter(adapter);
        return view;
    }
}
