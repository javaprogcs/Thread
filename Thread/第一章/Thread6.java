package com.fanke.Thread.第一章;

public class Thread6 extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 5000; i++) {
            System.out.println("i=" + (i + 1));
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread6 thread6 = new Thread6();
        thread6.start();
        Thread6.sleep(2000);
        Thread6.interrupted();//在5000线程当前停下做一个标记
    }
}