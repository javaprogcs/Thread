package com.fanke.Thread.第六章.singleton_2_2;

public class MyThread extends Thread{

    @Override
    public void run(){
        System.out.println(MyObject.getInstance().hashCode());
    }
}
