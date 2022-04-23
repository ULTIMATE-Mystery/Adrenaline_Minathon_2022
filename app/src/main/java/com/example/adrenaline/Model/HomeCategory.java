package com.example.adrenaline.Model;

public class HomeCategory {
    Integer categoryId;
    String categoryName;
    Integer imgURL;
    public HomeCategory( Integer categoryId,String categoryName, Integer imgURL) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.imgURL = imgURL;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getimgURL() {
        return imgURL;
    }

    public void setimgURL(Integer imgURL) {
        this.imgURL = imgURL;
    }
}
