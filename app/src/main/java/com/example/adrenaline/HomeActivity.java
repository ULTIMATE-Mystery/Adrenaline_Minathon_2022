package com.example.adrenaline;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adrenaline.Adapter.HomeBelowAdapter;
import com.example.adrenaline.Adapter.HomeCategoryAdapter;
import com.example.adrenaline.Adapter.HomePopularCategoryAdapter;
import com.example.adrenaline.Model.HomeBelow;
import com.example.adrenaline.Model.HomeCategory;
import com.example.adrenaline.Model.HomePopularCategory;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    HomeCategoryAdapter home_category_adapter;
    RecyclerView home_category_recycle;

    HomePopularCategoryAdapter home_popular_category_adapter;
    RecyclerView home_popular_category_recycle;

    HomeBelowAdapter home_below_adapter;
    RecyclerView home_below_recycle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);
        List<HomeCategory> homeCategoryList = new ArrayList<>();
        homeCategoryList.add(new HomeCategory(1,"Design",R.drawable.home_cate_design_img));
        homeCategoryList.add(new HomeCategory(2,"IT",R.drawable.home_cate_computer_foreground));
        homeCategoryList.add(new HomeCategory(3,"Tricks",R.drawable.home_cate_trick_foreground));
        homeCategoryList.add(new HomeCategory(4,"Writing",R.drawable.home_cate_writing_img));
        homeCategoryList.add(new HomeCategory(5,"Music",R.drawable.home_cate_music_foreground));
        homeCategoryList.add(new HomeCategory(6,"...",R.drawable.search));
        setCategoryRecycler(homeCategoryList);

        List<HomePopularCategory> homePopularCategoryList = new ArrayList<>();
        homePopularCategoryList.add(new HomePopularCategory(1,"Art"));
        homePopularCategoryList.add(new HomePopularCategory(2,"Academic"));
        homePopularCategoryList.add(new HomePopularCategory(3,"Babysit"));
        homePopularCategoryList.add(new HomePopularCategory(4,"Household"));
        homePopularCategoryList.add(new HomePopularCategory(5,"..."));
        setPopularCategoryRecycler(homePopularCategoryList);

        List<HomeBelow> HomeBelowList = new ArrayList<>();
        HomeBelowList.add(new HomeBelow(1,"Wall Painting","Vu Picasso","Create new vibe!"));
        HomeBelowList.add(new HomeBelow(1,"Stars","Van Picasso","Help you to draw stars"));
        HomeBelowList.add(new HomeBelow(1,"MU","Quang Picasso","Draw Harry Maguire"));
        setBelowRecycler(HomeBelowList);
    }
    private void setCategoryRecycler(List<HomeCategory> homeCategoryList)
    {
        home_category_recycle = findViewById(R.id.home_category_recycle);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        home_category_recycle.setLayoutManager(layoutManager);
        home_category_adapter= new HomeCategoryAdapter(this,homeCategoryList);
        home_category_recycle.setAdapter(home_category_adapter);
    }
    private void setPopularCategoryRecycler(List<HomePopularCategory> homePopularCategoryList)
    {
        home_popular_category_recycle = findViewById(R.id.home_popular_category_recycle);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        home_popular_category_recycle.setLayoutManager(layoutManager);
        home_popular_category_adapter= new HomePopularCategoryAdapter(this,homePopularCategoryList);
        home_popular_category_recycle.setAdapter(home_popular_category_adapter);
    }
    private void setBelowRecycler(List<HomeBelow> HomeBelowList)
    {
        home_below_recycle = findViewById(R.id.home_below_recycle);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        home_below_recycle.setLayoutManager(layoutManager);
        home_below_adapter= new HomeBelowAdapter(this,HomeBelowList);
        home_below_recycle.setAdapter(home_below_adapter);
    }
}
