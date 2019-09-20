package com.fanke.Thread.第四章.lockMehtodTest3;

import java.util.concurrent.locks.ReentrantLock;

public class Run {

    public static void main(String[] args) throws InterruptedException{
        ReentrantLock lock = new ReentrantLock(true);
        System.out.println(lock.isFair());

        ReentrantLock lock1 = new ReentrantLock(false);
        System.out.println(lock1.isFair());

        ReentrantLock lock2 = new ReentrantLock();
        System.out.println(lock2.isFair());


    }
}
