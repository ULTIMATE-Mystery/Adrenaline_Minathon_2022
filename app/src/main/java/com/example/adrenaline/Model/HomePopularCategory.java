package com.example.adrenaline.Model;

public class HomePopularCategory {
    Integer PopularCategoryId;
    String PopularCategoryName;

    public HomePopularCategory( Integer PopularCategoryId,String PopularCategoryName) {
        this.PopularCategoryId = PopularCategoryId;
        this.PopularCategoryName = PopularCategoryName;
    }

    public Integer getPopularCategoryId() {
        return PopularCategoryId;
    }

    public void setPopularCategoryId(Integer popularCategoryId) {
        PopularCategoryId = popularCategoryId;
    }

    public String getPopularCategoryName() {
        return PopularCategoryName;
    }

    public void setPopularCategoryName(String popularCategoryName) {
        PopularCategoryName = popularCategoryName;
    }
}
