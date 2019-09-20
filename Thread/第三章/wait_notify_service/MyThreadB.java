package com.fanke.Thread.第三章.wait_notify_service;

public class MyThreadB extends Thread {
    private MyService service;

    public MyThreadB(MyService service){
        super();
        this.service = service;
    }

    @Override
    public void run(){
        service.notifyMethod();
    }
}
