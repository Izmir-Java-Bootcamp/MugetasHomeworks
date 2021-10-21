package com.example.homeworkThree_;

import com.example.homeworkThree_.Category.SubCategory;
import jdk.jfr.Category;
import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Menu {

    private String selectedMenu;
    private Category category;
    private SubCategory subCategory;
    private String productName;

}

