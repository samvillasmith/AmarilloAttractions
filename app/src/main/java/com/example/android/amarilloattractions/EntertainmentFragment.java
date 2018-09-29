package com.example.android.amarilloattractions;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of clubs, bars, and other attractions.
 */
public class EntertainmentFragment extends Fragment {


    public EntertainmentFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        // Create a list of local places to go for entertainment.
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.ua2, R.string.ua1,
                R.drawable.uaimg));
        locations.add(new Location(R.string.bar2, R.string.bar1,
                R.drawable.guitars1));
        locations.add(new Location(R.string.globe2, R.string.globe1,
                R.drawable.globenews));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_central);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}