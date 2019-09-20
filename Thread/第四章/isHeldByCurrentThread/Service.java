package com.fanke.Thread.第四章.isHeldByCurrentThread;

import java.util.concurrent.locks.ReentrantLock;

public class Service {

    private ReentrantLock lock = new ReentrantLock();

    public void serviceMethod() {
        try{
            System.out.println(lock.isHeldByCurrentThread());
            lock.lock();
            System.out.println(lock.isHeldByCurrentThread());
        }finally {
            lock.unlock();
        }
    }
}