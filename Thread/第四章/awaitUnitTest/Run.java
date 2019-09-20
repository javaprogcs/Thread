package com.fanke.Thread.第四章.awaitUnitTest;

public class Run {

    public static void main(String[] args) throws InterruptedException{
         Service service = new Service();
         MyThreadA threadA = new MyThreadA(service);
         threadA.start();
    }
}
