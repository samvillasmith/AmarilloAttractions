package com.example.android.amarilloattractions;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of popular shopping centers in Amarillo.
 */
public class ShopsFragment extends Fragment {


    public ShopsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        // Create a list of shops
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.westgate2, R.string.westgate1,
                R.drawable.westgatemall));
        locations.add(new Location(R.string.soncy2, R.string.soncy1,
                R.drawable.westgateplaza1));
        locations.add(new Location(R.string.flea2, R.string.flea1,
                R.drawable.tanchor1));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_central);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}