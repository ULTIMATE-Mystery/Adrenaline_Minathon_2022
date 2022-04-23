package com.example.adrenaline.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.adrenaline.Model.HomeCategory;
import com.example.adrenaline.R;

import java.util.List;

public class HomeCategoryAdapter extends RecyclerView.Adapter<HomeCategoryAdapter.HomeCategoryViewHolder>{

    Context context;
    List<HomeCategory> homeCategoryList;
    public HomeCategoryAdapter (Context context, List<HomeCategory> homeCategoryList)
    {
        this.context=context;
        this.homeCategoryList=homeCategoryList;
    }
    @NonNull
    @Override
    public HomeCategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.home_category_recycle,parent,false);
        return new HomeCategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeCategoryViewHolder holder, int position) {
        holder.text.setText(homeCategoryList.get(position).getCategoryName());
        holder.img.setImageResource(homeCategoryList.get(position).getimgURL());
    }

    @Override
    public int getItemCount() {
        return homeCategoryList.size();
    }

    public class HomeCategoryViewHolder extends RecyclerView.ViewHolder {
        TextView text;
        ImageView img;
        public HomeCategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            text = itemView.findViewById(R.id.home_cate_text);
            img = itemView.findViewById(R.id.home_cate_img);
        }
    }
}
