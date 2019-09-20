package com.fanke.Thread.第四章.ReadWriteLockBegin2;

public class Test {

    public static void main(String[] args) throws InterruptedException{
         MyService service = new MyService();
         ThreadA threadA = new ThreadA(service);
         threadA.setName("A");
         threadA.start();

        ThreadA threadB = new ThreadA(service);
        threadB.setName("B");
        threadB.start();
    }
}
