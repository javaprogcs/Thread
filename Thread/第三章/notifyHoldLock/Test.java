package com.fanke.Thread.第三章.notifyHoldLock;

public class Test {

    public static void main(String[] args) throws InterruptedException{

        MyService service = new MyService();

        MyThreadA a = new MyThreadA(service);
        a.start();

        Thread.sleep(50);

        MyThreadB b = new MyThreadB(service);
        b.start();
    }
}
