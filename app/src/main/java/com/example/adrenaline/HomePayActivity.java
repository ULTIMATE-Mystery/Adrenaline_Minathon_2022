package com.example.adrenaline;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adrenaline.Adapter.HomeBelowAdapter;
import com.example.adrenaline.Adapter.HomeCategoryAdapter;
import com.example.adrenaline.Adapter.HomePayFirstAdapter;
import com.example.adrenaline.Model.HomeCategory;
import com.example.adrenaline.Model.HomePayFirst;

import java.util.ArrayList;
import java.util.List;

public class HomePayActivity extends AppCompatActivity {
    HomePayFirstAdapter home_PayFirst_adapter;
    RecyclerView home_first_pay_recycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_ready_for_pay);
        List<HomePayFirst> HomePayFirstList = new ArrayList<>();
        HomePayFirstList.add(new HomePayFirst(1,"Design","hehe"));
        HomePayFirstList.add(new HomePayFirst(2,"Design","hehe"));
        HomePayFirstList.add(new HomePayFirst(3,"Design","hehe"));
        HomePayFirstList.add(new HomePayFirst(4,"Design","hehe"));
        HomePayFirstList.add(new HomePayFirst(5,"Design","hehe"));
        setPayFirstRecycler(HomePayFirstList);
    }
    private void setPayFirstRecycler(List<HomePayFirst> HomePayFirstList)
    {
        home_first_pay_recycle = findViewById(R.id.home_first_pay_recycle);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        home_first_pay_recycle.setLayoutManager(layoutManager);
        home_PayFirst_adapter= new HomePayFirstAdapter(this,HomePayFirstList);
        home_first_pay_recycle.setAdapter(home_PayFirst_adapter);
    }
}
