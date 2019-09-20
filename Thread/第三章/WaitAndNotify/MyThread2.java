package com.fanke.Thread.第三章.WaitAndNotify;

public class MyThread2 extends Thread {
    private Object lock;

    public MyThread2(Object lock){
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        System.out.println("开始notify time=" + System.currentTimeMillis());
        lock.notify();
        System.out.println("结束notify time=" + System.currentTimeMillis());
    }
}
