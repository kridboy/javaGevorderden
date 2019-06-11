package com.keisse.gevorderd.hoofdstuk17.opdracht1;

public class DuoUtility {
    static void printUpper(Duo<String> d) {
        System.out.println(print(d.getFirst().toUpperCase(),d.getSecond().toUpperCase()));
    }
    static void printDuo(Duo<?> d){
        System.out.println(print(d.getFirst().toString(),d.getSecond().toString()));
    }

    static void printSum(Duo<? extends Number> d) {
        System.out.printf("\n%.2f\n",d.getFirst().doubleValue()+d.getSecond().doubleValue());
    }

    private static String print(String first,String second){
        return String.format("%s,%s \n",first,second);
    }
}
