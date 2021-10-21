package com.example.homeworkThree_.Category;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Data
public class SubCategory {
    private final String name;
    private  final List<Product> productList;

}
