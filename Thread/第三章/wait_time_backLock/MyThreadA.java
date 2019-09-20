package com.fanke.Thread.第三章.wait_time_backLock;

public class MyThreadA extends Thread {
    private MyService myService;

    public MyThreadA(MyService myService){
        super();
        this.myService = myService;
    }

    @Override
    public void run(){
        myService.testMethod();
    }
}
