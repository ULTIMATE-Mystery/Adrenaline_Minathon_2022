package com.example.adrenaline.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adrenaline.Model.HomePopularCategory;
import com.example.adrenaline.Model.Profile;
import com.example.adrenaline.R;

import java.util.List;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ProfileHolder> {
    Context context;
    List<Profile> ProfileList;
    public ProfileAdapter(Context context, List<Profile> ProfileList)
    {
        this.context=context;
        this.ProfileList=ProfileList;
    }
    @NonNull
    @Override
    public ProfileHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.home_below_recycle,parent,false);
        return new ProfileHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProfileHolder holder, int position) {
        holder.img.setImageResource(ProfileList.get(position).getImgURL());
        holder.heading.setText(ProfileList.get(position).getHeading());
        holder.author.setText(ProfileList.get(position).getAuthor());
        holder.des.setText(ProfileList.get(position).getDes());
    }

    @Override
    public int getItemCount() {
        return ProfileList.size();
    }

    public class ProfileHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView heading;
        TextView author;
        TextView des;
        public ProfileHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imageView11);
            heading = itemView.findViewById(R.id.home_below_heading);
            author = itemView.findViewById(R.id.home_below_author);
            des = itemView.findViewById(R.id.home_below_des);
        }
    }
}
