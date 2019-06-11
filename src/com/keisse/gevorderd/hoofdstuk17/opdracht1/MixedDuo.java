package com.keisse.gevorderd.hoofdstuk17.opdracht1;

public class MixedDuo<E1, E2> {
    private E1 first;
    private E2 second;

    public MixedDuo(E1 first, E2 second) {
        this.first = first;
        this.second = second;
    }

    public void setSecond(E2 second) {
        this.second = second;
    }

    public void setFirst(E1 first) {
        this.first = first;
    }

    public E2 getSecond() {
        return second;
    }

    public E1 getFirst() {
        return first;
    }
}
