package com.keisse.gevorderd.hoofdstuk17.opdracht1;

public class Duo<E> {
    private E first;
    private E second;

    public Duo(E first,E second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(E First){
        this.first = first;
    }

    public void setSecond(E Second){
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }

    public void swap(){
        E temp = second;
        second = first;
        first = temp;
    }
}
