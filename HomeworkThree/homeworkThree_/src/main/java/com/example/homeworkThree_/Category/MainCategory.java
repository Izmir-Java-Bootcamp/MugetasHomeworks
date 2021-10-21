package com.example.homeworkThree_.Category;

import com.example.homeworkThree_.Category.SubCategory;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Data
public class MainCategory {
    private final String name;
    private final List<SubCategory> subCategoryList;
}
