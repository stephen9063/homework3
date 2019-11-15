package com.example.model;

import java.util.ArrayList;

public class Favourite {
    private String favouriteList;

    private  String publishedDate;

    private ArrayList<cat> cats;

    public String getFavouriteList() {
        return favouriteList;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public ArrayList<cat> getCats() {
        return cats;
    }
}
