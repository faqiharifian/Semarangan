package com.arifian.udacity.semarangan.adapters;

import android.content.Context;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.arifian.udacity.semarangan.R;
import com.arifian.udacity.semarangan.entities.Location;

import java.util.List;

/**
 * Created by faqih on 15/04/17.
 */

public class SemaranganRecyclerAdapter extends RecyclerView.Adapter<SemaranganRecyclerAdapter.ViewHolder> {
    List<Location> locations;
    Context context;

    public SemaranganRecyclerAdapter(Context context, List<Location> locations) {
        this.locations = locations;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list_type_1, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Location location = locations.get(position);
        if(Build.VERSION.SDK_INT >= 21)
            holder.locationImageView.setImageDrawable(context.getDrawable(location.getImage()));
        else
            holder.locationImageView.setImageDrawable(context.getResources().getDrawable(location.getImage()));
        holder.locationNameTextView.setText(context.getString(location.getName()));
    }

    @Override
    public int getItemCount() {
        return locations.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView locationImageView;
        private TextView locationNameTextView, locationDescriptrionTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            locationImageView = (ImageView) itemView.findViewById(R.id.image_location);
            locationNameTextView = (TextView) itemView.findViewById(R.id.text_location_name);
//            locationDescriptrionTextView = (TextView) itemView.findViewById(R.id.text_location_description);
        }
    }
}
