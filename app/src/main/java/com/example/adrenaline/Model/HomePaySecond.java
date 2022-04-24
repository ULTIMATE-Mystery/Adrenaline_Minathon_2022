package com.example.adrenaline.Model;

public class HomePaySecond {
    Integer imgURL;
    String price;
    String heading;
    String des;

    public HomePaySecond(Integer imgURL, String price, String heading, String des) {
        this.imgURL = imgURL;
        this.price = price;
        this.heading = heading;
        this.des = des;
    }

    public Integer getImgURL() {
        return imgURL;
    }

    public void setImgURL(Integer imgURL) {
        this.imgURL = imgURL;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
