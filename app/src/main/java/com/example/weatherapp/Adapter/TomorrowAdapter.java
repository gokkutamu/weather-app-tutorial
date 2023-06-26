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
import com.example.weatherapp.Services.Tomorrow;

import java.util.ArrayList;

public class TomorrowAdapter extends RecyclerView.Adapter<TomorrowAdapter.viewHolder> {
    ArrayList<Tomorrow> data;
    Context context;

    public TomorrowAdapter(ArrayList<Tomorrow> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public TomorrowAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View inflates = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.viewholder_tomorrow, viewGroup, false);
        context = viewGroup.getContext();
        return new viewHolder(inflates);
    }

    @Override
    public void onBindViewHolder(@NonNull TomorrowAdapter.viewHolder holder, int i) {
        holder.textDay.setText(data.get(i).getDay());
        holder.textStatus.setText(data.get(i).getStatus());
        holder.textLox.setText(data.get(i).getLowTemp());
        holder.textHigh.setText(data.get(i).getHighTemp());

        int drawableResourceId = holder.itemView.getResources()
                .getIdentifier(data.get(i).getUrlPath(), "drawable", holder.itemView.getContext().getPackageName());

        Glide.with(context)
                .load(drawableResourceId)
                .into(holder.picture);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    // method viewHolder/
    public class viewHolder extends RecyclerView.ViewHolder {
        TextView textDay, textStatus, textLox, textHigh;
        ImageView picture;

        public viewHolder(@NonNull View item) {
            super(item);
            textDay = item.findViewById(R.id.textDay);
            textStatus = item.findViewById(R.id.textStatus);
            textLox = item.findViewById(R.id.textLox);
            textHigh = item.findViewById(R.id.textHigh);
            picture = item.findViewById(R.id.imgCloudy);
        }
    }
}
