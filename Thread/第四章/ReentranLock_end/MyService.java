package com.fanke.Thread.第四章.ReentranLock_end;

import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private ReentrantLock lock = new ReentrantLock();
    private String username = "abc";

    public void testMethod1(){
        try{
            lock.lock();
            System.out.println("begin " + Thread.currentThread().getName() + "  " + System.currentTimeMillis());
            System.out.println("print service " + username);
            Thread.sleep(400);
            System.out.println("    end " + Thread.currentThread().getName() + "  " + System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
