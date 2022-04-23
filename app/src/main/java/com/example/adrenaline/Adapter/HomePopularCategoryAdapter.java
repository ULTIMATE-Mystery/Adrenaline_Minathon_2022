package com.example.adrenaline.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adrenaline.Model.HomePopularCategory;
import com.example.adrenaline.R;

import java.util.List;

public class HomePopularCategoryAdapter extends RecyclerView.Adapter<HomePopularCategoryAdapter.HomePopularCategoryHolder> {

    Context context;
    List<HomePopularCategory> HomePopularCategoryList;

    public HomePopularCategoryAdapter (Context context, List<HomePopularCategory> HomePopularCategoryList)
    {
        this.context=context;
        this.HomePopularCategoryList=HomePopularCategoryList;
    }
    @NonNull
    @Override
    public HomePopularCategoryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.home_popularcategory_recycle,parent,false);
        return new HomePopularCategoryHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomePopularCategoryHolder holder, int position) {
        holder.categoryName.setText(HomePopularCategoryList.get(position).getPopularCategoryName());
    }

    @Override
    public int getItemCount() {
        return HomePopularCategoryList.size();
    }

    public class HomePopularCategoryHolder extends RecyclerView.ViewHolder {
        TextView categoryName;
        public HomePopularCategoryHolder(@NonNull View itemView) {
            super(itemView);
            categoryName = itemView.findViewById(R.id.home_popularcategory_text);
        }
    }
}
