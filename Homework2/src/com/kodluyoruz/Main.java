package com.kodluyoruz;

import java.util.Scanner;

public class Main {
    /**
     * This is the main class for the application, interacting
     * with the customer, adding to the cart different products to
     * be purchased and finally calculating the total amount to be paid
     */

    /**
     * Allows a cashier to enter the details for a product
     * to be purchased by a customer
     *
     * @param cart the shopping cart of a given customer
     */
    public static void askCustomer(Cart cart) {
        // Code to read from console the product name, seller,
        // price, number of products, discount and
        // if Buy2Take3 applies.
        // Then create a product of the correct type
        // and add it to the shopping cart
    }

    // Main method to interact with a customer
    public static void main(String[] args) {
        System.out.println("Welcome to kodluyoruz shop");
        System.out.println("What’s your name?");

        Scanner scanner = new Scanner(System.in);
        String customer = scanner.nextLine();
        System.out.println("Hi " + customer + ". Please choose one of the following options : ");

        int select = 1;
        Cart cart = new Cart();

        while (select == 1) {
            System.out.print("Enter 1 to buy a product\nEnter 0 to checkout and proceed with the payment ");
            select = scanner.nextInt();

            if (select == 0) {
                break;
            }

            System.out.print("Product name : ");
            scanner.nextLine();
            String productName = scanner.nextLine();

            System.out.print("Seller : ");
            String seller = scanner.nextLine();

            System.out.print("Price : ");
            int price = scanner.nextInt();

            System.out.print("How many : ");
            int count = scanner.nextInt();

            System.out.print("Discount (enter 0 if no discount applies): ");
            int discount = scanner.nextInt();

            System.out.println("Does Buy2Take3 apply? Y/N : ");
            scanner.nextLine();
            String buy2Take3 = scanner.nextLine();

            // 1 - Discount = 0, Buy2Take3 =N Product
            // 2 - Discount = 0, Buy2Take3 = Y Buy2Take3Product
            // 3 - Discount > 0, Buy2Take3 = N DiscountedProduct
            // 4 - Discount > 0, Buy2Take3 = Y Error!

            Product original = new Product(seller, productName, price);

            if (discount == 0 && buy2Take3.equals("N")) {
                Product product = new Product(original);
                cart.addProduct(product, count);

            } else if (discount == 0 && buy2Take3.equals("Y")) {
                Product product = new Buy2Take3Product(original);
                cart.addProduct(product, count);

            } else if (discount > 0 && buy2Take3.equals("N")) {
                Product product = new DiscountedProduct(original, discount);
                cart.addProduct(product, count);

            } else {
                System.out.println("Hatali Giris Yaptiniz.");
            }
        }
        if (select == 0) {
            System.out.println(cart.toString());
            System.out.println("In total you have to pay " + cart.totalPrice ()+ " TL");
        } else {
            System.out.println("Hatali Giris Yaptiniz.");
        }

        //Implement the user interface here
        // Ask the user to choose 0 (buy product) or
        // 1 (checkout), depending on what they want to do.
        // Use the method askCustomer
    }
}
