package com.example.adrenaline;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adrenaline.Adapter.HomeBelowAdapter;
import com.example.adrenaline.Adapter.HomeCategoryAdapter;
import com.example.adrenaline.Adapter.HomePayFirstAdapter;
import com.example.adrenaline.Adapter.HomePaySecondAdapter;
import com.example.adrenaline.Model.HomeCategory;
import com.example.adrenaline.Model.HomePayFirst;
import com.example.adrenaline.Model.HomePaySecond;

import java.util.ArrayList;
import java.util.List;

public class HomePayActivity extends AppCompatActivity {
    HomePayFirstAdapter home_PayFirst_adapter;
    RecyclerView home_first_pay_recycle;

    HomePaySecondAdapter home_PaySecond_adapter;
    RecyclerView home_second_pay_recycle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_ready_for_pay);
        List<HomePayFirst> HomePayFirstList = new ArrayList<>();
        HomePayFirstList.add(new HomePayFirst(1,"Design","Well"));
        HomePayFirstList.add(new HomePayFirst(2,"Idea","Good"));
        HomePayFirstList.add(new HomePayFirst(3,"Time","Fast"));
        HomePayFirstList.add(new HomePayFirst(4,"Value","High"));
        HomePayFirstList.add(new HomePayFirst(5,"...","..."));
        setPayFirstRecycler(HomePayFirstList);

        List<HomePaySecond> HomePaySecondList = new ArrayList<>();
        HomePaySecondList.add(new HomePaySecond(R.drawable.timesqure_for_home_second_pay,"$80","Hourly hire","Best for business appoiments"));
        HomePaySecondList.add(new HomePaySecond(R.drawable.calendar_for_second_pay_home,"$400","Daily Rent","Best for travel"));
        setPaySecondRecycler(HomePaySecondList);
    }
    private void setPayFirstRecycler(List<HomePayFirst> HomePayFirstList)
    {
        home_first_pay_recycle = findViewById(R.id.home_first_pay_recycle);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        home_first_pay_recycle.setLayoutManager(layoutManager);
        home_PayFirst_adapter= new HomePayFirstAdapter(this,HomePayFirstList);
        home_first_pay_recycle.setAdapter(home_PayFirst_adapter);
    }
    private void setPaySecondRecycler(List<HomePaySecond> HomePaySecondList)
    {
        home_second_pay_recycle = findViewById(R.id.home_second_pay_recycle);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        home_second_pay_recycle.setLayoutManager(layoutManager);
        home_PaySecond_adapter= new HomePaySecondAdapter(this,HomePaySecondList);
        home_second_pay_recycle.setAdapter(home_PaySecond_adapter);
    }
}
