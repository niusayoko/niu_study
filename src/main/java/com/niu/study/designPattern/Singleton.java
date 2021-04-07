package com.niu.study.designPattern;

/**
 * 单例模式：静态内部类
 *
 * @author niuqingsong
 * @date 2021/4/7
 */
public class Singleton {
    //因为使用静态内部类，所以这里不需要定义成员变量；

    //私有构造方法
    private Singleton() {
    }

    //静态内部类，只有在调用getInstance方法时才加载类
    //同时因为静态属性，只有在第一次加载类的时候初始化一 次，JVM帮我们保证了线程安全
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    private static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}