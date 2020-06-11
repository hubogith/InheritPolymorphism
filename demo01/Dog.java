package com.cssl.oop.demo01;

public class Dog extends Pet {
    private String strain = "拉布多犬";

    public Dog(String name, int health, int love,String strain) {
        super(name, health, love);
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("我是一只"+this.getStrain());
    }

    @Override
    public void toHos() {
        System.out.println("打针吃药");
       this.setHealth(60);
    }
}

