package com.keisse.gevorderd.projectEuler.oefening1;

public class SumSquare {
    public static void main(String[] args) {
        int sumOfSquares=0,squareOfSums=0;

        for(int i=1;i<101;i++){
            sumOfSquares+=Math.pow(i,2);
            squareOfSums+=i;
        }
        System.out.println((long) Math.pow(squareOfSums,2)-sumOfSquares);
    }
}
