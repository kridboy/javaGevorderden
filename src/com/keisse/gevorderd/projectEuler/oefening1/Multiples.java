package com.keisse.gevorderd.projectEuler.oefening1;

import java.util.stream.IntStream;

public class Multiples {
    public static void main(String[] args) {
        Integer totalOfMultiples = IntStream.range(1, 1000)
                .boxed()
                .filter(e -> e % 3 == 0 || e % 5 == 0)
                .reduce(0, Integer::sum);

        System.out.println(totalOfMultiples);
    }

}
