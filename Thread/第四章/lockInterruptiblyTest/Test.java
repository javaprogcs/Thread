package com.fanke.Thread.第四章.lockInterruptiblyTest;

public class Test {

    public static void main(String[] args) throws InterruptedException{
         MyService service = new MyService();
         ThreadA threadA = new ThreadA(service);
         threadA.setName("a");
         threadA.start();

         Thread.sleep(500);

         ThreadA threadB = new ThreadA(service);
         threadB.setName("b");
         threadB.start();

         Thread.sleep(500);

         threadB.interrupt();

        System.out.println("mian中断b，但并没有成功！");
    }
}
