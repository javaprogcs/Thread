package com.fanke.Thread.第四章.Fair_noFair_test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

    public Lock lock;

    public MyService(boolean fair){
        lock = new ReentrantLock(fair);
    }

    public void testMethod(){
        try{
            lock.lock();
            System.out.println("testMethod " + Thread.currentThread().getName());
            Thread.sleep(500);
            lock.unlock();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
