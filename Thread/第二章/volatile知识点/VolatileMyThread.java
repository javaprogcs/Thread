package com.fanke.Thread.第二章.volatile知识点;

public class VolatileMyThread extends  Thread {
    volatile public static int count;

    synchronized private static void addCount() {
        for (int i = 0; i < 100; i++) {
            count++;
        }
        System.out.println("count=" + count);
    }

    @Override
    public void run(){
        addCount();
    }

    public static void main(String[] args) {
        VolatileMyThread[] thread = new VolatileMyThread[100];
        for (int i = 0; i < 100; i++) {
            thread[i] = new VolatileMyThread();
        }

        for (int i = 0; i < 100; i++) {
            thread[i].start();
        }
    }
}
