package com.fanke.Thread.第六章.singleton_0;

import com.fanke.Thread.第五章.timerTest1.MyTask;

public class MyObject {
    private static MyObject myObject = new MyObject();
    private MyObject() {

    }
    public static MyObject getInsetance(){
        return myObject;
    }
}
