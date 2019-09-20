package com.fanke.Thread.第一章;

public class Thread_1_2_8_1 extends Thread {
    private int count = 5;

    public Thread_1_2_8_1(String name) {
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count > 0) {
            count--;
            System.out.println("由" + this.currentThread().getName() + "计算,count=" + count);
        }
    }

    public static void main(String[] args) {
        Thread_1_2_8_1 a = new Thread_1_2_8_1("a");
        Thread_1_2_8_1 b = new Thread_1_2_8_1("b");
        Thread_1_2_8_1 c = new Thread_1_2_8_1("c");

        a.start();
        b.start();
        c.start();
    }
}