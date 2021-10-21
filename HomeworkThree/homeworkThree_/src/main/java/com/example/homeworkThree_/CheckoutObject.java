package com.example.homeworkThree_;

import com.example.homeworkThree_.Category.Product;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CheckoutObject {

    private Product product;
    private int quantity;

    public CheckoutObject(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

}

