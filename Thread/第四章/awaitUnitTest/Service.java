package com.fanke.Thread.第四章.awaitUnitTest;

import java.util.Calendar;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {
    private ReentrantLock lock = new ReentrantLock();
    private Condition newCondition = lock.newCondition();

    public void waitMethod(){
        try{
             Calendar calendar = Calendar.getInstance();
             calendar.add(Calendar.SECOND,10);
             lock.lock();
            System.out.println("wait begin timer=" + System.currentTimeMillis());
            newCondition.awaitUntil(calendar.getTime());
            System.out.println("wait    end timer=" + System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void notifyMethod(){
        try{
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.SECOND,10);
            lock.lock();
            System.out.println("notify begin time=" + System.currentTimeMillis());
            newCondition.signalAll();
            System.out.println("notify end timer=" + System.currentTimeMillis());
        }finally {
            lock.unlock();
        }
    }
}
