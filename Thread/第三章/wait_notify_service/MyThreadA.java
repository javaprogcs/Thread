package com.fanke.Thread.第三章.wait_notify_service;

public class MyThreadA extends Thread {

    private MyService service;

    public MyThreadA(MyService service){
        super();
        this.service = service;
    }

    @Override
    public void run(){
        service.waitMethod();
    }
}
