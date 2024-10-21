package com.mongo.example.mongodbexample.controller;

public class A {

    public static void main(String[] args) {

        A a1 = new A();
        int x = a1.test();
        System.out.println(x);
    }

    public int test(){
        int x = example();
        return x;
    }

    public int example(){
        B b1 = new B();
        int y = b1.test1();
        return y;
    }
}
