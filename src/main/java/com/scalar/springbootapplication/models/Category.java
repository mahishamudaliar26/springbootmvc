package com.scalar.springbootapplication.models;


import lombok.Getter;
import lombok.Setter;


public class Category {
    private int id;
    private String title;
    private String description;
    private  Double price;
    private String imageUrl;
    private Category category;

    public Category() {
    }

    public Category(int id, String title, String description, Double price, String imageUrl, Category category) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.imageUrl = imageUrl;
        this.category = category;
    }
}
