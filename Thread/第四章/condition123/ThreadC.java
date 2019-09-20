package com.fanke.Thread.第四章.condition123;

public class ThreadC extends Thread {
    private MyService service;

    public ThreadC(MyService service){
        super();
        this.service = service;
    }

    @Override
    public void run(){
        service.testMethod3();
    }
}
