package com.fanke.Thread.第四章.awaitUninterruptiblyTest_1;

public class MyThread extends Thread {

    private Service service;

    public MyThread(Service service){
        super();
        this.service = service;
    }

    @Override
    public void run(){
        service.testMethod();
    }
}
