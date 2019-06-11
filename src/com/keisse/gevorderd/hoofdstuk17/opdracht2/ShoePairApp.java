package com.keisse.gevorderd.hoofdstuk17.opdracht2;

public class ShoePairApp implements Pair<Shoe>{
    private Shoe leftShoe;
    private Shoe rightShoe;

    public ShoePairApp(Shoe leftShoe, Shoe RightShoe) {
        this.leftShoe = leftShoe;
        this.rightShoe = rightShoe;
    }

    public void setRightShoe(Shoe rightShoe) {
        this.rightShoe = rightShoe;
    }

    public void setLeftShoe(Shoe leftShoe) {
        this.leftShoe = leftShoe;
    }

    public Shoe getRightShoe() {
        return rightShoe;
    }

    public Shoe getLeftShoe() {
        return leftShoe;
    }


    @Override
    public Shoe getLeft() {
        return null;
    }

    @Override
    public Shoe getRight() {
        return null;
    }

    @Override
    public void setLeft(Shoe left) {

    }

    @Override
    public void setRight(Shoe right) {

    }
}

