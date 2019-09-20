package com.fanke.Thread.第四章.ReadWriteLockBegin3;

public class ThreadB extends Thread{
    private MyService myService;

    public ThreadB(MyService service){
        super();
        this.myService = service;
    }

    @Override
    public void run(){
        myService.write();
    }

}
