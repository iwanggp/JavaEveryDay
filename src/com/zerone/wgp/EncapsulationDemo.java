package com.zerone.wgp;

/**
 * 封装演示
 */
class Person {
    private int age;

    public void speak() {
        System.out.println("age=" + age);
    }

    public void setAge(int age) {
        this.age = age;
    }

}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Person p = new Person();
//        p.age = -20;//当定义为私有的时候不能访问
        p.speak();
    }

}
