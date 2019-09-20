package com.fanke.Thread.第四章.z3_ok;

public class MyThreadA extends Thread {

    private MyService myService;

    public MyThreadA(MyService myService){
        super();
        this.myService = myService;
    }

    @Override
    public void run(){
        myService.waitMethod();
    }
}
