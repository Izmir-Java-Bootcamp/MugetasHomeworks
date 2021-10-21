package com.example.homeworkThree_.Category;


import lombok.Builder;
import lombok.Data;


@Builder
@Data

public class Product {

    private final String name;
    private final String description;
    private final double price;

    @Override
    public String toString() {
        return "Product{" + "name='" + name + "\n" +", description=" + description + "\n" + ", price=" + price +" }";
    }


}