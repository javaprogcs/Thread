package com.fanke.Thread.第四章.condition123;

public class ThreadB extends Thread {
    private MyService service;

    public ThreadB(MyService service){
        super();
        this.service = service;
    }

    @Override
    public void run(){
        service.testMethod2();
    }
}
