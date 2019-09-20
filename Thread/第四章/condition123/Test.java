package com.fanke.Thread.第四章.condition123;

public class Test {
    public static void main(String[] args)throws InterruptedException {
        MyService service = new MyService();
        for (int i = 0; i < 5; i++) {
            ThreadA threadA = new ThreadA(service);
            threadA.start();

            ThreadB threadB = new ThreadB(service);
            threadB.start();

            ThreadC threadC = new ThreadC(service);
            threadC.start();

        }
    }
}
