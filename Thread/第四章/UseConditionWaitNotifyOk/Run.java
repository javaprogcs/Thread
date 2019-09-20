package com.fanke.Thread.第四章.UseConditionWaitNotifyOk;

public class Run {

    public static void main(String[] args) throws InterruptedException{
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();

        Thread.sleep(3000);

        service.signal();
    }
}
