package com.keisse.gevorderd.projectEuler.oefening1;

public class Fibonacci {
    public static void main(String[] args) {
        long i = 1, y = 2,z=0;
        while (y <=4000000) {
            z += i % 2 == 0 ? i : 0;
            z += y % 2 == 0 ? y : 0;
            i +=y;
            y+=i;
        }

        System.out.println(z);
    }
}
