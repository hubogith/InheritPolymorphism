package com.cssl.oop.demo01;

public class Penguin extends Pet {
    private String sex = "Q仔";
    public Penguin(String name, int health, int love) {
        super(name, health, love);
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("我的性别是:"+this.getSex());
    }

    @Override
    public void toHos() {
        System.out.println("吃药");
       this.setHealth(60);
    }
}
