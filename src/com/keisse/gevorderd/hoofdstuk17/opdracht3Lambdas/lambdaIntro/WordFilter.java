package com.keisse.gevorderd.hoofdstuk17.opdracht3Lambdas.lambdaIntro;

@FunctionalInterface
public interface WordFilter {
    boolean isValid(String s);

    static boolean hasString(String s){
        return s.contains("la")||s.contains("g");
    }
}
