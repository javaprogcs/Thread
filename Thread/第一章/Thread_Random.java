package com.fanke.Thread.第一章;

import java.util.Random;

public class Thread_Random extends Thread {

    @Override
    public void run(){
        long beginTimee = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            random.nextInt();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("***** thread 1 use time=" + (endTime - beginTimee));

    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread_Random thread_random = new Thread_Random();
            thread_random.setPriority(5);
            thread_random.start();

            Thrad_Random_2 random2 = new Thrad_Random_2();
            random2.setPriority(6);
            random2.start();
        }
    }
}

class Thrad_Random_2 extends Thread{

    @Override
    public void run(){
        long beginTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            random.nextInt();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("#### thread 2 use time=" + (endTime - beginTime));
    }
}

