package com.cssl.oop.demo01;

public class Text {
    public static void main(String[] args) {
        //创建父类引用对象
        Pet dog = new Dog("多多", 30, 89, "吉娃娃");
        dog.print();
        //创建主人类对象
        Master master = new Master();
        //主人类对象调用cure方法，并传参dog对象
        master.cure(dog);

        System.out.println("*************");
        dog.print();

    }
}
