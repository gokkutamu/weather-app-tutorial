package com.example.weatherapp.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.weatherapp.R;
import com.example.weatherapp.Services.Hourly;

import java.util.ArrayList;

public class HourlyAdapter extends RecyclerView.Adapter<HourlyAdapter.viewHolder> {
    ArrayList<Hourly> data;
    Context context;

    public HourlyAdapter(ArrayList<Hourly> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public HourlyAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View inflates = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.viewholder_hourly, viewGroup, false);
        context = viewGroup.getContext();
        return new viewHolder(inflates);
    }

    @Override
    public void onBindViewHolder(@NonNull HourlyAdapter.viewHolder viewHolder, int i) {
        viewHolder.textHourly.setText(data.get(i).getHour());
        viewHolder.textTemp.setText(data.get(i).getIntTemp() + "°");

        int drawableResourceId = viewHolder.itemView.getResources()
                .getIdentifier(data.get(i).getUrlPath(), "drawable", viewHolder.itemView.getContext().getPackageName());

        Glide.with(context)
                .load(drawableResourceId)
                .into(viewHolder.picture);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    // method viewHolder/
    public class viewHolder extends RecyclerView.ViewHolder {
        TextView textHourly, textTemp;
        ImageView picture;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            textHourly = itemView.findViewById(R.id.textHourly);
            textTemp = itemView.findViewById(R.id.textTemp);
            picture = itemView.findViewById(R.id.imgCloudy03);
        }
    }
}
