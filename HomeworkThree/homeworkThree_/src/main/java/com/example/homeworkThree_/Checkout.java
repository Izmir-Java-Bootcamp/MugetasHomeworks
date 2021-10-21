package com.example.homeworkThree_;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Checkout {

    private List<CheckoutObject> checkoutItems;
    private double totalPrice;


    public double getTotalPrice() {
        double total = 0;
        for (CheckoutObject checkoutObject :
                checkoutItems) {
            total += checkoutObject.getQuantity() * checkoutObject.getProduct().getPrice();
        }
        return total;
    }
}

