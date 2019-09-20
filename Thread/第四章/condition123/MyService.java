package com.fanke.Thread.第四章.condition123;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private ReentrantLock lock = new ReentrantLock();
    private Condition newCondition = lock.newCondition();

    volatile private int nextWhoPrint = 1;

    public void testMethod1() {
        try{
            lock.lock();
            while (nextWhoPrint != 1) {
                newCondition.await();
            }
            System.out.println("AAA");
            nextWhoPrint = 2;
            newCondition.signalAll();
            lock.unlock();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void testMethod2() {
        try{
            lock.lock();
            while(nextWhoPrint != 2){
                newCondition.await();
            }
            System.out.println("    BBB");
            nextWhoPrint = 3;
            newCondition.signalAll();
            lock.unlock();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void testMethod3(){
        try{
            lock.lock();
            while (nextWhoPrint != 2) {
                newCondition.await();
            }
            System.out.println("    CCC");
            nextWhoPrint = 3;
            newCondition.signalAll();
            lock.unlock();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
