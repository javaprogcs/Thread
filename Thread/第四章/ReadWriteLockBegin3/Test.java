package com.fanke.Thread.第四章.ReadWriteLockBegin3;

public class Test {

    public static void main(String[] args) throws InterruptedException{
         MyService service = new MyService();

        ThreadB threadB = new ThreadB(service);
        threadB.setName("B");
        threadB.start();

        ThreadA threadA = new ThreadA(service);
        threadA.setName("A");
        threadA.start();
    }
}
