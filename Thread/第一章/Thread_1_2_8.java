package com.fanke.Thread.第一章;

public class Thread_1_2_8 extends Thread {
    private int count = 5;

    public Thread_1_2_8(String name) {
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
        Thread_1_2_8 a = new Thread_1_2_8("a");
        Thread_1_2_8 b = new Thread_1_2_8("b");
        Thread_1_2_8 c = new Thread_1_2_8("c");

        a.start();
        b.start();
        c.start();
    }
}