package com.fanke.Thread.第二章.volatile知识点;

import java.util.concurrent.atomic.AtomicInteger;

public class AddCountThread extends Thread {
    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run(){
        for (int i = 0; i < 10000; i++) {
            System.out.println(count.incrementAndGet());
        }
    }

    public static void main(String[] args) {
        AddCountThread countThread = new AddCountThread();

        Thread t1 = new Thread(countThread);
        t1.start();

        Thread t2 = new Thread(countThread);
        t2.start();

        Thread t3 = new Thread(countThread);
        t3.start();

        Thread t4 = new Thread(countThread);
        t4.start();

        Thread t5 = new Thread(countThread);
        t5.start();
    }
}
