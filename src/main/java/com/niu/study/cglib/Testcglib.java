package com.niu.study.cglib;

public class Testcglib {

    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy();
        // base为生成的增强过的目标类
        Base base = Factory.getInstance(proxy);
        base.add();
    }
}