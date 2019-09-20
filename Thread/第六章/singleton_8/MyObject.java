package com.fanke.Thread.第六章.singleton_8;

public class MyObject {

    private static MyObject instance = null;

    private MyObject(){}

    static {
        instance = new MyObject();
    }

    public static MyObject getInstance(){
        return instance;
    }
}
