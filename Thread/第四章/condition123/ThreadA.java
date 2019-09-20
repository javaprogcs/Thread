package com.fanke.Thread.第四章.condition123;

public class ThreadA extends Thread {
    private MyService service;

    public ThreadA(MyService service){
        super();
        this.service = service;
    }

    @Override
    public void run(){
        service.testMethod1();
    }
}
