package com.fanke.Thread.第四章.lockInterruptiblyTest;

import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private ReentrantLock lock = new ReentrantLock();

    public void testMethod(){
        try{
            //lock.lock();
            lock.lockInterruptibly();
            System.out.println("begin " + Thread.currentThread().getName() + "  " + System.currentTimeMillis());
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                String s = new String();
                Math.random();

                Thread.currentThread().yield();
            }
            System.out.println("    end " + Thread.currentThread().getName() + " " + System.currentTimeMillis());

        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }

}
