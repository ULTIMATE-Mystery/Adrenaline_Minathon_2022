package com.example.adrenaline.Model;

public class Profile {
    Integer imgURL;
    String heading;
    String author;
    String des;

    public Profile(Integer imgURL, String heading, String author, String des) {
        this.imgURL = imgURL;
        this.heading = heading;
        this.author = author;
        this.des = des;
    }

    public Integer getImgURL() {
        return imgURL;
    }

    public void setImgURL(Integer imgURL) {
        this.imgURL = imgURL;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
