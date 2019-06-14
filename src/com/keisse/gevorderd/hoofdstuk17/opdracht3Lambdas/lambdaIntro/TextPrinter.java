package com.keisse.gevorderd.hoofdstuk17.opdracht3Lambdas.lambdaIntro;

import java.util.function.Function;
import java.util.function.Predicate;

public class TextPrinter {
    String s = "ik ben. een grote! boer lalala. lamda's testen! enal wtf hahaha ";
    String n = "25.3 12.2 33.8 22 1 0.5";

    //methode mag ook static zijn
    public void printFilteredWords(WordFilter filter) {
        for (String e : s.split(" ")) if (filter.isValid(e)) System.out.println(e);
        //interface method call
    }

    public void printProcessed(TextUtil util) {
        for (String e : s.split(" ")) System.out.println(util.process(e));
    }

    public void printFunct(Function<String, String> funct) {
        for (String e : s.split(" ")) System.out.println(funct.apply("wa"));
    }

    public Double printsum(NumberVal val) {
        Double b = Double.valueOf(0);
        for (String e : n.split(" ")) {
            b += val.toDouble(e);
        }
        return b;
    }

    //predicate doet if en voert uit
    //consumer neemt type T aan, voert uit
    //function

    //BELANGRIJK: method references moeten altijd in context gebeuren -> Statische klasse/interface moet statische functie aanroepen
    public boolean hasLeesteken(String lambaStr) {
        return lambaStr.contains("!") || lambaStr.contains(".");
    }

    public static void main(String[] args) {
        TextPrinter tp = new TextPrinter();

        //                   (String e)
        tp.printFilteredWords(e -> e.indexOf('e') == 1);
        System.out.println("---------");

        tp.printFilteredWords(e -> e.contains("a"));
        System.out.println("---------");
        tp.printFilteredWords(e -> e.length() > 5);

        //instance call
        System.out.println("---------");
        tp.printFilteredWords(tp::hasLeesteken);

        //static call
        System.out.println("---------");
        tp.printFilteredWords(WordFilter::hasString);

        System.out.println("---------");
        tp.printProcessed(TextUtil::reverse);

        //boolean conditions!
        Predicate<String> condit1 = e -> e.contains("e");
        Predicate<String> condit2 = e -> e.length() < 5;
        Predicate<int[]> condit = e -> e[0] > 2;


        System.out.println("---------");
        tp.printProcessed(TextUtil::reverse);

        System.out.println("------@@---");
        tp.printProcessed(TextUtil::scramble);

        System.out.println("---------");
        System.out.println(tp.printsum(Double::new));

    }
}
