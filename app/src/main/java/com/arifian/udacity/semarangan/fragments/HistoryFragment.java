package com.arifian.udacity.semarangan.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arifian.udacity.semarangan.R;
import com.arifian.udacity.semarangan.adapters.SemaranganRecyclerAdapter;
import com.arifian.udacity.semarangan.entities.Location;
import com.arifian.udacity.semarangan.view.SpacesItemDecoration;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HistoryFragment extends Fragment {
    public static final String TITLE = "History";

    public HistoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_history, container, false);

        List<Location> histories = new ArrayList<>();
        histories.add(new Location(R.string.history_1_name, R.drawable.history_1_image, R.string.history_1_description, R.string.history_1_latitude, R.string.history_1_longitude));
        histories.add(new Location(R.string.history_2_name, R.drawable.history_2_image, R.string.history_2_description, R.string.history_2_latitude, R.string.history_2_longitude));
        histories.add(new Location(R.string.history_3_name, R.drawable.history_3_image, R.string.history_3_description, R.string.history_3_latitude, R.string.history_3_longitude));
        histories.add(new Location(R.string.history_4_name, R.drawable.history_4_image, R.string.history_4_description, R.string.history_4_latitude, R.string.history_4_longitude));

        RecyclerView itemRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_history);

        int spacingInPixels = getResources().getDimensionPixelSize(R.dimen.default_space);
        itemRecyclerView.addItemDecoration(new SpacesItemDecoration(spacingInPixels));

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        itemRecyclerView.setLayoutManager(layoutManager);

        SemaranganRecyclerAdapter adapter = new SemaranganRecyclerAdapter(getActivity(), histories);
        itemRecyclerView.setAdapter(adapter);

        return view;
    }

}
