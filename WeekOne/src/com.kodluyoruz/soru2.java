package com.kodluyoruz;

import java.util.Scanner;

public class soru2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pattern Giriniz");
        String pattern = scanner.next();

        while (true) {
            System.out.println("Metin Giriniz");
            String str = scanner.nextLine();

            if (str.equals("Exit")) {
                System.out.println("Bye");
                break;
            }

            boolean match = occursIn(pattern, str);

            if (match) {
                System.out.println(pattern + " occurs in " + str);
            } else {
                System.out.println(pattern + " does NOT occur in " + str);
            }
        }

    }

    public static boolean occursIn(String pattern, String str) {

        int lastMatchIndex = -1;
        boolean match = false;
        int s = 0;

        for (int p = 0; p < pattern.length(); p++) {

            char patternChar = pattern.charAt(p);

            if (patternChar == '*') {
                continue;
            }

            if (s + 1 == str.length()) {
                match = false;
            }

            for (s = lastMatchIndex + 1; s < str.length(); s++) {

                char strChar = str.charAt(s);

                if (patternChar == strChar) {
                    lastMatchIndex = s;
                    match = true;
                    break;
                } else {
                    match = false;
                }
            }

            if (s == str.length()) {
                break;
            }
        }

        return match;
    }
}