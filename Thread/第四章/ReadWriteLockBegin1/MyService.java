package com.fanke.Thread.第四章.ReadWriteLockBegin1;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MyService {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private String username = "abc";

    public void testMethod1(){
        try{
            lock.readLock().lock();
            System.out.println("begin " + Thread.currentThread().getName() + "  " + System.currentTimeMillis());
            System.out.println("print service " + username);
            Thread.sleep(400);
            System.out.println("    end " + Thread.currentThread().getName() + "  " + System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
