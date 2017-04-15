package com.arifian.udacity.semarangan.adapters;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.arifian.udacity.semarangan.DetailActivity;
import com.arifian.udacity.semarangan.R;
import com.arifian.udacity.semarangan.entities.Location;

import java.util.List;

/**
 * Created by faqih on 15/04/17.
 */

public class SemaranganRecyclerAdapter extends RecyclerView.Adapter<SemaranganRecyclerAdapter.ViewHolder> {
    public static final int TYPE_1 = 1;
    public static final int TYPE_2 = 2;
    private List<Location> locations;
    private Context context;
    private int type;

    public SemaranganRecyclerAdapter(Context context, List<Location> locations, int type) {
        this.locations = locations;
        this.context = context;
        this.type = type;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        switch (type){
            case TYPE_2:
                v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_list_type_2, parent, false);
                break;
            default:
                v = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_list_type_1, parent, false);
                break;
        }
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Location location = locations.get(position);
        if(Build.VERSION.SDK_INT >= 21)
            holder.locationImageView.setImageDrawable(context.getDrawable(location.getImage()));
        else
            holder.locationImageView.setImageDrawable(context.getResources().getDrawable(location.getImage()));
        holder.locationNameTextView.setText(context.getString(location.getName()));
        if (type == TYPE_2){
            holder.locationCategoryTextView.setText(context.getString(location.getCategory()));
        }

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra(DetailActivity.KEY_LOCATION, location);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return locations.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView locationImageView;
        private TextView locationNameTextView, locationCategoryTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            locationImageView = (ImageView) itemView.findViewById(R.id.image_location);
            locationNameTextView = (TextView) itemView.findViewById(R.id.text_location_name);
            locationCategoryTextView = (TextView) itemView.findViewById(R.id.text_location_category);
        }
    }
}
