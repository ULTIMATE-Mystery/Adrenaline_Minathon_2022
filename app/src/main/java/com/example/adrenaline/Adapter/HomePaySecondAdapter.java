package com.example.adrenaline.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adrenaline.Model.HomePaySecond;
import com.example.adrenaline.Model.HomePopularCategory;
import com.example.adrenaline.R;

import java.util.List;

public class HomePaySecondAdapter extends RecyclerView.Adapter<HomePaySecondAdapter.HomePaySecondHolder> {
    Context context;
    List<HomePaySecond> HomePaySecondList;

    public HomePaySecondAdapter(Context context, List<HomePaySecond> HomePaySecondList)
    {
        this.context=context;
        this.HomePaySecondList=HomePaySecondList;
    }
    @NonNull
    @Override
    public HomePaySecondAdapter.HomePaySecondHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.home_ready_to_pay_second_behindscene,parent,false);
        return new HomePaySecondHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomePaySecondAdapter.HomePaySecondHolder holder, int position) {
        holder.img.setImageResource(HomePaySecondList.get(position).getImgURL());
        holder.price.setText(HomePaySecondList.get(position).getPrice());
        holder.heading.setText(HomePaySecondList.get(position).getHeading());
        holder.des.setText(HomePaySecondList.get(position).getDes());
    }

    @Override
    public int getItemCount() {
        return HomePaySecondList.size();
    }

    public class HomePaySecondHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView price;
        TextView heading;
        TextView des;
        public HomePaySecondHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.home_pay_second_img);
            price = itemView.findViewById(R.id.home_pay_second_price);
            heading = itemView.findViewById(R.id.home_pay_second_heading);
            des = itemView.findViewById(R.id.home_pay_second_des);
        }
    }
}
