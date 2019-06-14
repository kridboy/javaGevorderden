package com.keisse.gevorderd.hoofdstuk17.opdracht3Lambdas.lambdaIntro;

public interface TextUtil {
    String process(String s);

    static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    static String scramble(String s) {
        s = s.replaceAll("a", "@")
                .replaceAll("e", "€")
                .replaceAll("l", "1")
                .replaceAll("o", "0")
                .replaceAll("h", "4")
                .replaceAll("wtf", "WHAT THE ACTUAL ??!!!!11111 lamba's zijn wel ng nice i guess :)");
        ;

        return s;
    }

    static double parseDouble(String s){
        return Double.parseDouble(s);
    }


}
