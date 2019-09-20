package com.fanke.Thread.第二章;

public class HoldsLockThread {

    public static void main(String[] args) {
        System.out.println("A " + Thread.currentThread().holdsLock(HoldsLockThread.class));
        synchronized (HoldsLockThread.class){
            System.out.println("B " + Thread.currentThread().holdsLock(HoldsLockThread.class));
        }
        System.out.println("C " + Thread.currentThread().holdsLock(HoldsLockThread.class));
    }
}
