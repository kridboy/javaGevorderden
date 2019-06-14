package com.keisse.gevorderd.hoofdstuk17.opdracht4;

public enum Coin {
    ONE_CENT(0.01),
    TWO_CENT(0.02),
    FIVE_CENT(0.05),
    TEN_CENT(0.10),
    TWENTY_CENT(0.20),
    FIFTY_CENT(0.50),
    ONE_EURO(1D),
    TWO_EURO(2D);

    private double value;

    Coin(double d){
        setValue(d);
    }
    public double getValue(){
        return value;
    }
    private void setValue(double x){
        value = x;
    }
}
