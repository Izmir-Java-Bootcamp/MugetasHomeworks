package com.kodluyoruz.demo;

import java.util.ArrayList;
import java.util.List;


public class MainCatagories {
    private final List<Product> products;

    public MainCatagories() {
        products = new ArrayList<>();
    }

    public List<Product> getProducts() {

        return this.products;
    }

    public void addProduct(Product product) {
        this.products.add(product);

    }

    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }


    public void addProduct(Product product, int howManyTimes) {
        for (int i = 1; i <= howManyTimes; i++) {
            this.products.add(product);
        }
    }


    public double totalPrice() {

        double totalprice = 0;

        for (int i = 0; i < products.stream().count(); i++) {
            totalprice += products.get(i).getPrice(this);
        }

        return totalprice;
    }


    }


