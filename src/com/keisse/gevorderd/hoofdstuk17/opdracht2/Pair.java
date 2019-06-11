package com.keisse.gevorderd.hoofdstuk17.opdracht2;

interface Pair<E>{
    public E getLeft();
    public E getRight();

    public void setLeft(E left);
    public void setRight(E right);

    public default void swap(){
        E temp = getLeft();
        setLeft(getRight());
        setRight(temp);
    }
}