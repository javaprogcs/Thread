package com.fanke.Thread.第四章.tryLockTest;

public class Run {

    public static void main(String[] args)throws InterruptedException {
        final MyService service = new MyService();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };

         Thread threadA = new Thread(runnable);
         threadA.setName("a");
         threadA.start();

        Thread threadB = new Thread(runnable);
        threadB.setName("b");
        threadB.start();
    }
}
