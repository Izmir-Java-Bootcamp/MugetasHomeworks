package com.kodluyoruz.demo;

public class Products {

        private final String name;
        private final String description;
        private final double price ;

    public Products(String name, String description, double price){
            this.name = name;
            this.description = description;
            this.price = price;

            public String getName() {
                return name;
            }

            public void setName (String name){
                this.name = name;
            }

            public String getDescription () {
                return description;
            }

            public void setDescription (String description){
                this.description = description;
            }

            public int getPrice () {
                return price;
            }

            public void setPrice ( int price){
                this.price = price;
            }

            public String toString () {
                return "Name: " + name + " Description: " + description + " Price :" + price;
            }
        }

}