package com.fanke.Thread.第四章.ConditionTest;

public class ThreadA extends Thread {

    private MyService myService;

    public ThreadA(MyService myService){
        super();
        this.myService = myService;
    }

    @Override
    public void run(){
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            myService.set();
        }
    }
}
