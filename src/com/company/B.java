package com.company;

public class B extends A {
    private int bX = 1;
    public B(){}

    @Override
    public void setX(int x){
        super.setX(x);
        bX=x;
        System.out.println("bX is assigned:" + x);
    }

    public void printX(){
        System.out.println("bX="+ bX);
    }
}
