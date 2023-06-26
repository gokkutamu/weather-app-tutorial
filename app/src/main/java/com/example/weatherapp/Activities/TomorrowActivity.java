package com.example.weatherapp.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.weatherapp.Adapter.HourlyAdapter;
import com.example.weatherapp.Adapter.TomorrowAdapter;
import com.example.weatherapp.R;
import com.example.weatherapp.Services.Hourly;
import com.example.weatherapp.Services.Tomorrow;

import java.util.ArrayList;

public class TomorrowActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterTomorrow;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tomorrow);

        initRecyclerView();
        setVariable();
    }

    private void setVariable() {
        ConstraintLayout btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(view -> startActivity(new Intent(TomorrowActivity.this, MainActivity.class)));
    }

    private void initRecyclerView() {
        ArrayList<Tomorrow> data = new ArrayList<>();

        data.add(new Tomorrow("", "", "", 1, 2));
        data.add(new Tomorrow("", "", "", 1, 2));
        data.add(new Tomorrow("", "", "", 1, 2));
        data.add(new Tomorrow("", "", "", 1, 2));
        data.add(new Tomorrow("", "", "", 1, 2));


        recyclerView = findViewById(R.id.scrollView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        adapterTomorrow = new TomorrowAdapter(data);
        recyclerView.setAdapter(adapterTomorrow);
    }


}
