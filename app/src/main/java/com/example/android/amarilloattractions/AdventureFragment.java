package com.example.android.amarilloattractions;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of fun places to go.
 */
public class AdventureFragment extends Fragment {


    public AdventureFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        // Create a list of fun places to go.
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.cadillac, R.string.cadillac2,
                R.drawable.cadillacimg));
        locations.add(new Location(R.string.botanical, R.string.botanical2,
                R.drawable.botanicalimg));
        locations.add(new Location(R.string.paloduro1, R.string.paloduro2,
                R.drawable.paloduroimg));
        locations.add(new Location(R.string.meredith1, R.string.meredith2,
                R.drawable.meredithimg));


        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_central);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);


        return rootView;
    }
}