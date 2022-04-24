package com.example.adrenaline;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adrenaline.Adapter.HomeBelowAdapter;
import com.example.adrenaline.Adapter.HomeCategoryAdapter;
import com.example.adrenaline.Adapter.ProfileAdapter;
import com.example.adrenaline.Model.HomeCategory;
import com.example.adrenaline.Model.Profile;

import java.util.ArrayList;
import java.util.List;


public class ProfileActivity extends AppCompatActivity {
    ProfileAdapter profileRecyclerAdapter;
    RecyclerView profileRecycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        List<Profile> profileRecyclerList = new ArrayList<>();
        profileRecyclerList.add(new Profile(R.drawable.profile_recycler,"Wall painting","Quang Vu","I can draw your future"));
        profileRecyclerList.add(new Profile(R.drawable.home_below_img,"Ball painting","Quang Duy","I can draw your Ball"));
        profileRecyclerList.add(new Profile(R.drawable.profile_recycler,"Tall painting","Ti Van","I can draw you not tall"));
        profileRecyclerList.add(new Profile(R.drawable.profile_recycler,"Tall painting","Ti Van","I can draw you not tall"));
        setprofileRecycler(profileRecyclerList);
    }
    private void setprofileRecycler(List<Profile> profileRecyclerList)
    {
        profileRecycler = findViewById(R.id.profile_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        profileRecycler.setLayoutManager(layoutManager);
        profileRecyclerAdapter = new ProfileAdapter(this,profileRecyclerList);
        profileRecycler.setAdapter(profileRecyclerAdapter);
    }
}
