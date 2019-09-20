package com.fanke.Thread.第四章.isLocked;

import java.util.concurrent.locks.ReentrantLock;

public class Service {

    private ReentrantLock lock = new ReentrantLock();

    public void serviceMethod(){
        try{
            System.out.println(lock.isLocked());
            lock.lock();
            System.out.println(lock.isLocked());
        }finally {
            lock.unlock();
        }
    }
}
