package com.fanke.Thread.第四章.ConditionTestMoreMethod;

public class ThreadB extends Thread {

    private MyService myService;

    public ThreadB(MyService myService){
        super();
        this.myService = myService;
    }

    @Override
    public void run(){
        myService.methodB();
    }
}
