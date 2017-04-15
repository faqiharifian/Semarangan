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
public class FamilyFragment extends Fragment {
    public static final String TITLE = "Family";

    public FamilyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_family, container, false);

        List<Location> families = new ArrayList<>();
        families.add(new Location(R.string.family_1_name, R.drawable.family_1_image, R.string.family_1_description, R.string.family_1_latitude, R.string.family_1_longitude));
        families.add(new Location(R.string.family_2_name, R.drawable.family_2_image, R.string.family_2_description, R.string.family_2_latitude, R.string.family_2_longitude));
        families.add(new Location(R.string.family_3_name, R.drawable.family_3_image, R.string.family_3_description, R.string.family_3_latitude, R.string.family_3_longitude));
        families.add(new Location(R.string.family_4_name, R.drawable.family_4_image, R.string.family_4_description, R.string.family_4_latitude, R.string.family_4_longitude));
        families.add(new Location(R.string.family_5_name, R.drawable.family_5_image, R.string.family_5_description, R.string.family_5_latitude, R.string.family_5_longitude));
        families.add(new Location(R.string.family_6_name, R.drawable.family_6_image, R.string.family_6_description, R.string.family_6_latitude, R.string.family_6_longitude));

        RecyclerView itemRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_family);
        int spacingInPixels = getResources().getDimensionPixelSize(R.dimen.default_space);
        itemRecyclerView.addItemDecoration(new SpacesItemDecoration(spacingInPixels));

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        itemRecyclerView.setLayoutManager(layoutManager);

        SemaranganRecyclerAdapter adapter = new SemaranganRecyclerAdapter(getActivity(), families);
        itemRecyclerView.setAdapter(adapter);

        return view;
    }

}
