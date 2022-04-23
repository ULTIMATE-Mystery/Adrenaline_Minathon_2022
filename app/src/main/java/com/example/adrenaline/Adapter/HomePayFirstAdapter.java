package com.example.adrenaline.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adrenaline.Model.HomePayFirst;
import com.example.adrenaline.Model.HomePopularCategory;
import com.example.adrenaline.R;

import java.util.List;

public class HomePayFirstAdapter extends RecyclerView.Adapter<HomePayFirstAdapter.HomePayFirstHolder> {
    Context context;
    List<HomePayFirst> HomePayFirstList;
    public HomePayFirstAdapter(Context context, List<HomePayFirst> HomePayFirstList)
    {
        this.context=context;
        this.HomePayFirstList=HomePayFirstList;
    }
    @NonNull
    @Override
    public HomePayFirstHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.home_ready_to_pay_first_behindscene,parent,false);
        return new HomePayFirstHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomePayFirstHolder holder, int position) {
        holder.t1.setText(HomePayFirstList.get(position).getText1());
        holder.t2.setText(HomePayFirstList.get(position).getText2());
    }

    @Override
    public int getItemCount() {
        return HomePayFirstList.size();
    }

    public class HomePayFirstHolder extends RecyclerView.ViewHolder{
        TextView t1;
        TextView t2;
        public HomePayFirstHolder(@NonNull View itemView) {
            super(itemView);
            t1=itemView.findViewById(R.id.first_pay_behindscene_heading);
            t2=itemView.findViewById(R.id.first_pay_behindscene_des);
        }
    }
}
