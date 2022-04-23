package com.example.adrenaline.Model;

public class HomePayFirst {
    Integer id;
    String text1;
    String text2;
    public HomePayFirst( Integer id,String text1,String text2) {
        this.id =id;
        this.text1 = text1;
        this.text2 = text2;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }
}
