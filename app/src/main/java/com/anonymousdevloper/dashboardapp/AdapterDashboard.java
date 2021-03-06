package com.anonymousdevloper.dashboardapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.anonymousdevloper.dashboardapp.databinding.ItemDashboardBinding;

import java.util.List;

public class AdapterDashboard extends RecyclerView.Adapter<AdapterDashboard.DashboardViewHolder>{


    private List<DashboardModel> dashboard;

    public AdapterDashboard(List<DashboardModel> dashboard) {
        this.dashboard = dashboard;
    }




    @NonNull
    @Override
    public DashboardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        ItemDashboardBinding itemDashboardBinding = ItemDashboardBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new DashboardViewHolder(itemDashboardBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull DashboardViewHolder holder, int position) {
        holder.setDashboard(dashboard.get(position));

    }

    @Override
    public int getItemCount() {
        return dashboard.size();
    }

    class DashboardViewHolder extends RecyclerView.ViewHolder{

        ItemDashboardBinding binding;

       DashboardViewHolder(ItemDashboardBinding itemDashboardBinding){
           super(itemDashboardBinding.getRoot());
           binding = itemDashboardBinding;
       }

       void setDashboard(DashboardModel dashboard){

           binding.imageProfile.setImageResource(dashboard.getImageId());
           binding.textTitle.setText(dashboard.getTitle());
       }
    }
}
