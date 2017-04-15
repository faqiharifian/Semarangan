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

public class ReligiousFragment extends Fragment {
    public static final String TITLE = "Religious";

    public ReligiousFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_religious, container, false);

        List<Location> religiouss = new ArrayList<>();
        religiouss.add(new Location(R.string.religious_1_name, R.drawable.religious_1_image, R.string.religious_1_description, R.string.religious_1_latitude, R.string.religious_1_longitude));
        religiouss.add(new Location(R.string.religious_2_name, R.drawable.religious_2_image, R.string.religious_2_description, R.string.religious_2_latitude, R.string.religious_2_longitude));
        religiouss.add(new Location(R.string.religious_3_name, R.drawable.religious_3_image, R.string.religious_3_description, R.string.religious_3_latitude, R.string.religious_3_longitude));
        religiouss.add(new Location(R.string.religious_4_name, R.drawable.religious_4_image, R.string.religious_4_description, R.string.religious_4_latitude, R.string.religious_4_longitude));
        religiouss.add(new Location(R.string.religious_5_name, R.drawable.religious_5_image, R.string.religious_5_description, R.string.religious_5_latitude, R.string.religious_5_longitude));
        religiouss.add(new Location(R.string.religious_6_name, R.drawable.religious_6_image, R.string.religious_6_description, R.string.religious_6_latitude, R.string.religious_6_longitude));
        religiouss.add(new Location(R.string.religious_7_name, R.drawable.religious_7_image, R.string.religious_7_description, R.string.religious_7_latitude, R.string.religious_7_longitude));

        RecyclerView itemRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_religious);
        SemaranganRecyclerAdapter adapter = new SemaranganRecyclerAdapter(getActivity(), religiouss, SemaranganRecyclerAdapter.TYPE_1);
        itemRecyclerView.setAdapter(adapter);

        return view;
    }
}
