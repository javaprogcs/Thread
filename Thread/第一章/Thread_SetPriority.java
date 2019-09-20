package com.fanke.Thread.第一章;

import java.util.Random;

public class Thread_SetPriority  extends Thread{

    @Override
    public void run(){
        long beginTime = System.currentTimeMillis();
        long addResult = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 50000; j++) {
                Random random = new Random();
                random.nextInt();
                addResult = addResult + i;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("*****thread 1 use time =" + (endTime - addResult));
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread_SetPriority priority = new Thread_SetPriority();
            priority.setPriority(10);
            priority.start();

            Thread_SetPriority_2 setPriority2 = new Thread_SetPriority_2();
            setPriority2.setPriority(1);
            setPriority2.start();
        }
    }
}

class Thread_SetPriority_2 extends Thread{
    @Override
    public void run(){
        long beginTime = System.currentTimeMillis();
        long addResult = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 50000; j++) {
                Random random = new Random();
                random.nextInt();
                addResult = addResult + i;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("&&&&thread 2 use time=" + (endTime - beginTime));
    }
}

