package com.cssl.oop.demo01;

public class Pet {
    private String name = "无名氏";
    private int health = 100;
    private int love = 0;

    public Pet(String name, int health, int love) {
        this.name = name;
        this.health = health;
        this.love = love;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }
/*
输出宠物信息
 */
    public void print() {
        System.out.println("宠物的自白：\n我的名字叫" + this.getName() +
                ",健康值是：" + this.getHealth() + ",亲密度：" + this.getLove());
    }
    /*
    宠物看病方法
     */
    public void toHos(){}
}
