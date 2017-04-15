package com.arifian.udacity.semarangan.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arifian.udacity.semarangan.R;
import com.arifian.udacity.semarangan.adapters.SemaranganRecyclerAdapter;
import com.arifian.udacity.semarangan.entities.Location;

import java.util.ArrayList;
import java.util.List;

public class NatureFragment extends Fragment {
    public static final String TITLE = "Nature";

    public NatureFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_nature, container, false);

        List<Location> natures = new ArrayList<>();
        natures.add(new Location(R.string.nature_1_name, R.string.nature_1_category, R.drawable.nature_1_image, R.string.nature_1_description, R.string.nature_1_latitude, R.string.nature_1_longitude));
        natures.add(new Location(R.string.nature_2_name, R.string.nature_2_category, R.drawable.nature_2_image, R.string.nature_2_description, R.string.nature_2_latitude, R.string.nature_2_longitude));
        natures.add(new Location(R.string.nature_3_name, R.string.nature_3_category, R.drawable.nature_3_image, R.string.nature_3_description, R.string.nature_3_latitude, R.string.nature_3_longitude));
        natures.add(new Location(R.string.nature_4_name, R.string.nature_4_category, R.drawable.nature_4_image, R.string.nature_4_description, R.string.nature_4_latitude, R.string.nature_4_longitude));
        natures.add(new Location(R.string.nature_5_name, R.string.nature_5_category, R.drawable.nature_5_image, R.string.nature_5_description, R.string.nature_5_latitude, R.string.nature_5_longitude));
        natures.add(new Location(R.string.nature_6_name, R.string.nature_6_category, R.drawable.nature_6_image, R.string.nature_6_description, R.string.nature_6_latitude, R.string.nature_6_longitude));

        RecyclerView itemRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_nature);

        SemaranganRecyclerAdapter adapter = new SemaranganRecyclerAdapter(getActivity(), natures, SemaranganRecyclerAdapter.TYPE_2);
        itemRecyclerView.setAdapter(adapter);

        return view;
    }
}
