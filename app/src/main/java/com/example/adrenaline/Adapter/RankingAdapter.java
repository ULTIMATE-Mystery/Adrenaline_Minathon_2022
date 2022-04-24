package com.example.adrenaline.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adrenaline.Model.Profile;
import com.example.adrenaline.Model.Ranking;
import com.example.adrenaline.R;

import java.util.List;

public class RankingAdapter extends RecyclerView.Adapter<RankingAdapter.RankingHolder> {
    Context context;
    List<Ranking> RankingList;
    public RankingAdapter (Context context, List<Ranking> RankingList)
    {
        this.context=context;
        this.RankingList=RankingList;
    }
    @NonNull
    @Override
    public RankingAdapter.RankingHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.ranking_layout,parent,false);
        return new RankingHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RankingAdapter.RankingHolder holder, int position) {
        holder.name.setText(RankingList.get(position).getName());
        holder.num.setText(RankingList.get(position).getNum());
    }

    @Override
    public int getItemCount() {
        return RankingList.size();
    }

    public class RankingHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView num;
        public RankingHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.ranking_name);
            num = itemView.findViewById(R.id.ranking_num);
        }
    }
}
