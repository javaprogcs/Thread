package com.fanke.Thread.第四章.ConditionTestMoreMethod;

public class ThreadA extends Thread {

    private MyService myService;

    public ThreadA(MyService myService){
        super();
        this.myService = myService;
    }

    @Override
    public void run(){
        myService.methodA();
    }
}
