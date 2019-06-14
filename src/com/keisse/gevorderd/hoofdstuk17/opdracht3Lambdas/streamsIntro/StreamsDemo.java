package com.keisse.gevorderd.hoofdstuk17.opdracht3Lambdas.streamsIntro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsDemo {
    static final String LINE = "----------";

    static int maal(int a,int b){
        return a*b;
    }
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> nr = new ArrayList<>();
        List<Person> people = new ArrayList<>();

        Person[] fek = new Person[3];

        fek[0] = new Person(SexEnum.MAN,25,78.3,188,"kenny","db");
        fek[1] = new Person(SexEnum.MAN,25,78.3,188,"kenny","db");
        fek[2] = new Person(SexEnum.MAN,25,78.3,188,"kenny","db");

        for(int i=0;i<15;i++) people.add( new Person());

        IntStream intStream = IntStream.range(0, 420);

        System.out.println(
                intStream.asDoubleStream()
                        .reduce(0, Double::sum)//reduce operation takes identity and reduces
//                .reduce(0,(total,e)->Double.sum(total,e));
        );

        System.out.println(LINE);
        System.out.println(
                numbers.stream()
                        .filter(e -> e % 2 == 0)
                        .map(e -> e * 2)
                        .reduce(0, StreamsDemo::maal)
        );

        System.out.println(LINE);
        System.out.println(
                IntStream.range(0, 666)
                        .filter(e -> e % 5 == 0)
                        .sum()
        );

        System.out.println(LINE);
        numbers.forEach(e -> System.out.printf("%d\n", e));

        System.out.println(LINE);
        System.out.println(
                (long) IntStream.range(5, 123)
                        .filter(e -> e % 5 == 0)
                        .reduce(1, (acc, el) -> acc * el)
        );

        System.out.println(LINE);
        System.out.println(
                numbers.stream()
                        .map(String::valueOf)//mapping to string
                        .reduce("", (carry, str) -> carry.concat(str)) //reduce operation, takes initial value and performs operations
        );

        System.out.println(LINE);
        people.forEach(System.out::println);

        oefening1(people);

        //.forEach(System.out::println);

        Stream pipeLine = Stream.of("Het is gigantisch fuckign saai als ge als alles gezien hebt xD ")//stream of strings
                .filter(String::isBlank)
                .filter(s->s.contains("e"));

        System.out.print("geef euh weetwel:  ");
        Scanner kb = new Scanner(System.in);
        int x = kb.nextInt();

        Stream.of(fek)
                .filter(e->e.getGeslacht()==SexEnum.MAN)
                .filter((e->e.getAge()<50&&e.getAge()>20))
                .filter(e->e.getWeight()>50)
                .forEach(System.out::println);

    }

    static void oefening1(List<Person> people){
        Consumer<Person> c = System.out::println;
        System.out.println(LINE);
        System.out.println("OEFENING");
        System.out.println(
                IntStream.range(0, 666)
                        .count()
        );
        System.out.println(
                IntStream.range(0, 666)
                        .max()
        );
        System.out.println(
                IntStream.range(0, 666)
                        .min()
        );
        System.out.println(
                IntStream.range(0, 666)
                        .average()
        );
        System.out.println(
                IntStream.rangeClosed(1, 25)
                        .reduce(1, (acc, el) -> acc * el)
        );

        System.out.println(
                IntStream.rangeClosed(1, 25)
                        .reduce(1, (acc, el) -> acc * el)
        );
        people.stream()
                .map(s->s.getName()+s.getSurName())
                .forEach(System.out::println);

        people.stream()
                .map(e->e.getAge())
                .forEach(System.out::println);



    }
}
