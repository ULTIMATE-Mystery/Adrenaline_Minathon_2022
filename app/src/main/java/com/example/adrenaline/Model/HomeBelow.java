package com.example.adrenaline.Model;

public class HomeBelow {
    Integer HomeBelowId;
    String text1;
    String text2;
    String text3;

    public HomeBelow(Integer homeBelowId, String text1, String text2, String text3) {
        HomeBelowId = homeBelowId;
        this.text1 = text1;
        this.text2 = text2;
        this.text3 = text3;
    }

    public Integer getHomeBelowId() {
        return HomeBelowId;
    }

    public void setHomeBelowId(Integer homeBelowId) {
        HomeBelowId = homeBelowId;
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

    public String getText3() {
        return text3;
    }

    public void setText3(String text3) {
        this.text3 = text3;
    }
}
