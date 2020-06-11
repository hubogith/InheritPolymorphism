package com.cssl.oop.demo01;
//主人类
public class Master {
    //给宠物看病

    //父类引用，根据具体传的对象，进行调用相应对象toHos（）方法
    public void  cure(Pet pet){
        if (pet.getHealth()<50){
            pet.toHos();
        }
    }

}
