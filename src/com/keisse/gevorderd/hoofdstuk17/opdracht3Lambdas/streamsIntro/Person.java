package com.keisse.gevorderd.hoofdstuk17.opdracht3Lambdas.streamsIntro;

import java.util.Random;

public class Person {
    public SexEnum geslacht;
    int age;
    double weight;
    int length;
    String name, surName;

    public Person() {
        Random x = new Random();
        setGeslacht(x.nextBoolean() == true ? SexEnum.MAN : SexEnum.VROUW);
        setWeight(x.nextDouble()*100);
        setAge(x.nextInt(100));
        setSurName("De brandeflorefli");
        setName(getGeslacht() == SexEnum.MAN ? "Jan" : "Maria");
        setLength(x.nextInt(70) + 135);
    }

    public Person(SexEnum geslacht, int age, double weight, int length, String name, String surName) {
        setGeslacht(geslacht);
        setAge(age);
        setLength(length);
        setName(name);
        setSurName(surName);
        setGeslacht(geslacht);
        setWeight(weight);
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGeslacht(SexEnum geslacht) {
        this.geslacht = geslacht;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getLength() {
        return length;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }


    public String getSurName() {
        return surName;
    }

    public String getName() {
        return name;
    }

    public SexEnum getGeslacht() {
        return geslacht;
    }

    public static Person isman(Person p) {
        if (p.getGeslacht().equals(SexEnum.MAN))
            return p;
        else return null;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return String.format(
                "Person{geslacht=%s, age=%d, weight=%.2f, length=%dcm ,name='%s', surName='%s'}",
                getGeslacht(), getAge(), getWeight(), getLength(), getName(), getSurName()
        );

    }
}

