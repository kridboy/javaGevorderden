package com.keisse.gevorderd.hoofdstuk17.opdracht4;

import java.util.*;
import com.keisse.gevorderd.hoofdstuk17.opdracht3Lambdas.streamsIntro.Person;
import com.keisse.gevorderd.hoofdstuk17.opdracht3Lambdas.streamsIntro.SexEnum;

public class CollectionsDemo {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    Scanner kb = new Scanner(System.in);
    Random random  =new Random();

    public static void main(String[] args) {
        CollectionsDemo demo = new CollectionsDemo();

        //demo.oef1();
        demo.oef2();
    }

    public void oef1() {
        numbers.forEach(System.out::println);
        System.out.println(
                numbers.stream()
                        .reduce(0, Integer::sum)
        );
        int median = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.print("\n====\tList van String(Builder)\t=====\n");
        System.out.print("geef begin van woorden: ");

        StringBuilder builder = new StringBuilder(kb.next());
        List<StringBuilder> list= new ArrayList<>();
        list.add(builder);

        while (list.get(list.size()-1).lastIndexOf(".")!=list.get(list.size()-1).length()-1) list.add(new StringBuilder(kb.next()));
        for(int i=0;i<list.size();i++) System.out.println(list.get(list.size()-1-i));

        System.out.printf("de lijst is: %d woorden groot\n",list.size());

        for(StringBuilder e:list) System.out.println(e);

    }

    public void oef2(){
        Set<Integer> numberList = new HashSet<>();
        Set<StringBuilder> wordList  = new HashSet<>();
        Set<Person> people = new HashSet<>();

        numberList.add(random.nextInt(100));
        numberList.add(random.nextInt(100));
        numberList.add(random.nextInt(100));
        numberList.add(random.nextInt(100));
        numberList.add(random.nextInt(100));
        numberList.add(random.nextInt(100));

        numberList.forEach(System.out::println);

        Iterator<StringBuilder> iterator = wordList.iterator();
        System.out.print("geef woorden: ");
        String word = kb.next();
        while(!word.contains(".")){
            word = kb.next();
            wordList.add(new StringBuilder(word));
        }

        //unieke elementen!
        numberList = new HashSet<>();

        while(numberList.size()<7){
            numberList.add(kb.nextInt());
        }
        numberList.forEach(System.out::println);

        numberList = new HashSet<>();
        Set<Integer> winningNumbers = new HashSet<>();

        while(winningNumbers.size()<7){
            winningNumbers.add(random.nextInt(10));
        }

        while(numberList.size()<7){
            numberList.add(random.nextInt(10));
        }

        System.out.print("\n====\twinnende nrs\t=====\n");
        numberList.retainAll(winningNumbers);
        numberList.forEach(System.out::println);

        System.out.print("\n====\tPeoplekes\t=====\n");
        Person p = new Person(SexEnum.MAN,25,50,180,"Michiel","Vanvyve");
        while(people.size()<5) people.add(new Person());
        people.add(p);
        people.add(p);

        people.forEach(System.out::println);

    }
}

