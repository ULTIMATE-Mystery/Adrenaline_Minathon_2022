package com.example.adrenaline.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.adrenaline.Model.HomeBelow;
import com.example.adrenaline.R;

import java.util.List;

public class HomeBelowAdapter extends RecyclerView.Adapter<HomeBelowAdapter.HomeBelowHolder> {
    Context context;
    List<HomeBelow> HomeBelowList;
    public HomeBelowAdapter(Context context, List<HomeBelow> HomeBelowList)
    {
        this.context=context;
        this.HomeBelowList=HomeBelowList;
    }

    @NonNull
    @Override
    public HomeBelowHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.home_below_recycle,parent,false);
        return new HomeBelowHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeBelowHolder holder, int position) {
        holder.text1.setText(HomeBelowList.get(position).getText1());
        holder.text2.setText(HomeBelowList.get(position).getText2());
        holder.text3.setText(HomeBelowList.get(position).getText3());
    }

    @Override
    public int getItemCount() {
        return HomeBelowList.size();
    }

    public class HomeBelowHolder extends RecyclerView.ViewHolder{
        TextView text1;
        TextView text2;
        TextView text3;
        public HomeBelowHolder(@NonNull View itemView) {
            super(itemView);
            text1 = itemView.findViewById(R.id.home_below_heading);
            text2 = itemView.findViewById(R.id.home_below_author);
            text3 = itemView.findViewById(R.id.home_below_des);
        }
    }
}
