package com.fanke.Thread.第四章.ReentranLock_end;

public class ThreadA extends Thread{
    private MyService myService;

    public ThreadA(MyService service){
        super();
        this.myService = service;
    }

    @Override
    public void run(){
        myService.testMethod1();
    }

}
