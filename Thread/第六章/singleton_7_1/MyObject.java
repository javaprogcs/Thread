package com.fanke.Thread.第六章.singleton_7_1;

import java.io.Serializable;

public class MyObject implements Serializable {

    private static final  long serialVersionUID = (long) 888F;

    public static UserInfo userInfo = new UserInfo();

    private static MyObject myObject = new MyObject();

    private MyObject(){}


    public static MyObject getInstance(){
        return myObject;
    }
}
