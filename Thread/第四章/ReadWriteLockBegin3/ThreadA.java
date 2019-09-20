package com.fanke.Thread.第四章.ReadWriteLockBegin3;

public class ThreadA extends Thread{
    private MyService myService;

    public ThreadA(MyService service){
        super();
        this.myService = service;
    }

    @Override
    public void run(){
        myService.read();
    }

}
