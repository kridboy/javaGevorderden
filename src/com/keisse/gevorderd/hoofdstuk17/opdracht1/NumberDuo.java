package com.keisse.gevorderd.hoofdstuk17.opdracht1;

public class NumberDuo<E extends  Number> {
    private E first;
    private E second;

    public NumberDuo(E first, E second) {
        this.first = first;
    }

    public E getSecond() {
        return second;
    }

    public E getFirst() {
        return first;
    }

    public void setSecond(E second) {
        this.second = second;
    }

    public void setFirst(E first) {
        this.first = first;
    }

    public double getSum(){
        return first.doubleValue() + second.doubleValue();
    }
}
