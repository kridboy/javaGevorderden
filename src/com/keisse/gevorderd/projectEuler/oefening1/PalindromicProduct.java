package com.keisse.gevorderd.projectEuler.oefening1;

public class PalindromicProduct {

    public static void main(String[] args) {
        StringBuilder test;
        Integer product;
        String fek;
        for (int i = 1000; i >= 100; i--) {
            for (int y = 1000; y >= 100; y--) {
                product = i*y;
                test = new StringBuilder(product.toString());
                fek = test.toString();
                if (fek.equals(test.reverse().toString())) {
                    System.out.println(test);
                    break;
                }
            }
        }
    }

}
