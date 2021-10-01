package com.kodluyoruz;

import java.util.Scanner;

public class soru1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi Giriniz");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {

            for (int l = 0; l < n; l++) {

                if (i == 0 || i == (n - 1) || l == 0 || l == (n - 1)) {
                    System.out.print("*");
                    // Toplami cift mi?
                } else if ((i + l) % 2 == 0) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


