package com.example.model;

public class FavouriteResponse {
    public long id;
    public  String image_id;
    public String sub_id;
    public int user_id;
    public Favourite results;

    public long getId() {
        return id;
    }

    public String getImage_id() {
        return image_id;
    }

    public String getSub_id() {
        return sub_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public Favourite getResults() {
        return results;
    }
}
