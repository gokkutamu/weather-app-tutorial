package com.example.weatherapp.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.weatherapp.Adapter.HourlyAdapter;
import com.example.weatherapp.R;
import com.example.weatherapp.Services.Hourly;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterHourly;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();
        setVariable();
    }

    private void setVariable() {
        TextView textNext = findViewById(R.id.textNext);
        textNext.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, TomorrowActivity.class)));
    }

    private void initRecyclerView() {
        ArrayList<Hourly> data = new ArrayList<>();

        data.add(new Hourly("10 pm", 28, "cloudy"));
        data.add(new Hourly("11 pm", 28, "cloudy"));
        data.add(new Hourly("12 pm", 28, "cloudy"));
        data.add(new Hourly("12 pm", 28, "cloudy"));
        data.add(new Hourly("12 pm", 28, "cloudy"));
        data.add(new Hourly("12 pm", 28, "cloudy"));
        data.add(new Hourly("12 pm", 28, "cloudy"));
        data.add(new Hourly("12 pm", 28, "cloudy"));


        recyclerView = findViewById(R.id.widgetRecycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        adapterHourly = new HourlyAdapter(data);
        recyclerView.setAdapter(adapterHourly);
    }
}