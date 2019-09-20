package com.fanke.Thread.第三章.joinTest;

public class Test {

    public static void main(String[] args) {
        try{
            MyThread myThread = new MyThread();
            myThread.start();
            myThread.join();

            System.out.println("我想当threadTest对象执行完我再执行，我做到了");
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
