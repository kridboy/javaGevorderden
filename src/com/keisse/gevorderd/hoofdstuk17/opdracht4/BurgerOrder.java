package com.keisse.gevorderd.hoofdstuk17.opdracht4;

public class BurgerOrder {
    private String name;
    private int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public BurgerOrder(String name) {
        this.name = name;
        this.number++;
    }

}
