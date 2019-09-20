package com.fanke.Thread.第四章.ReadWriteLockBegin2;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MyService {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void testMethod1(){
        try{
            try{
                lock.readLock().lock();
                System.out.println("获得写锁 " + Thread.currentThread().getName() + "  " + System.currentTimeMillis());

                Thread.sleep(10000);
            }finally {
                lock.writeLock().unlock();
            }

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
