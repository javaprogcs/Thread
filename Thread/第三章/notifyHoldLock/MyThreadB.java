package com.fanke.Thread.第三章.notifyHoldLock;

public class MyThreadB extends  Thread {

    private MyService myService;

    public MyThreadB(MyService myService){
        super();
        this.myService = myService;

    }

    @Override
    public void run(){
        myService.notifyMethod();
    }
}
