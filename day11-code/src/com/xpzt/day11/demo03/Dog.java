package com.xpzt.day11.demo03;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃shit");
    }

    public void watchHouse(){
        System.out.println("狗看家");
    }
}
