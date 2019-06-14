package com.keisse.gevorderd.hoofdstuk17.opdracht4;

import com.keisse.gevorderd.hoofdstuk17.opdracht3Lambdas.streamsIntro.Person;

import java.util.Comparator;

public class AgeComperator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        return p1.getAge()-p2.getAge();
    }

    @Override
    public Comparator<Person> reversed() {
        return null;
    }
}
