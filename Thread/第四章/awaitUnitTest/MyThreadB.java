package com.fanke.Thread.第四章.awaitUnitTest;

public class MyThreadB extends Thread {

    private Service service;

    public MyThreadB(Service service){
        super();
        this.service = service;
    }

    @Override
    public void run(){
        service.notifyMethod();
    }
}
