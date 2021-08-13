package com.anonymousdevloper.dashboardapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;

import android.os.Bundle;

import com.anonymousdevloper.dashboardapp.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        DashboardModel[] dashboard = new DashboardModel[]{
                new DashboardModel("Two Wheeler Insurance",R.drawable.bycicle),
                new DashboardModel("Car Insurance",R.drawable.car),
                new DashboardModel("Van Insurance", R.drawable.delivery),
                new DashboardModel("Travel Insurance", R.drawable.globe),
                new DashboardModel("Health Insurance", R.drawable.healthcare),

        };
        AdapterDashboard adapter = new AdapterDashboard(Arrays.asList(dashboard));
        binding.dashboardRv.setHasFixedSize(true);
        binding.dashboardRv.setAdapter(adapter);
       // binding.dashboardRv.addItemDecoration(new DividerItemDecoration(getApplicationContext(), DividerItemDecoration.VERTICAL));


    }
}