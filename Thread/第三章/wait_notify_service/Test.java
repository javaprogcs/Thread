package com.fanke.Thread.第三章.wait_notify_service;

public class Test {

    public static void main(String[] args) throws InterruptedException{
        MyService service = new MyService();
        MyThreadA a = new MyThreadA(service);
        a.start();
        Thread.sleep(5000);
        MyThreadB b = new MyThreadB(service);
        b.start();
    }
}
