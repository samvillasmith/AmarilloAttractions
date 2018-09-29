package com.example.android.amarilloattractions;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list great restaurants in Amarillo.
 */
public class FoodFragment extends Fragment {


    public FoodFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        // Create a list of restaurants
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.kabuki2, R.string.kabuki1,
                R.drawable.kabuki));
        locations.add(new Location(R.string.bextex2, R.string.bigtex1,
                R.drawable.bigtexanfood));
        locations.add(new Location(R.string.abuelos2, R.string.abuelos1,
                R.drawable.abuelos3));


        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_central);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}