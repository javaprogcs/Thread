package com.fanke.Thread.第四章.Fair_noFair_test;

public class MyThread extends Thread {
    private MyService myService;

    public MyThread(MyService myService){
        super();
        this.myService = myService;
    }

    public void run(){
        myService.testMethod();
    }
}
