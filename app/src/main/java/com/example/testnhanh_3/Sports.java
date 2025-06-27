package com.example.testnhanh_3;

public class Sports {
    private String name;
    private int imageResId;

    public Sports(String name, int imageResId) {
        this.name = name;
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public int getImageResId() {
        return imageResId;
    }
}
