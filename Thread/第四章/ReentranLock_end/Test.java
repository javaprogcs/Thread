package com.fanke.Thread.第四章.ReentranLock_end;

public class Test {

    public static void main(String[] args) throws InterruptedException{
         MyService service = new MyService();
         ThreadA threadA = new ThreadA(service);
         threadA.start();

        ThreadA threadB = new ThreadA(service);
        threadB.start();
    }
}
