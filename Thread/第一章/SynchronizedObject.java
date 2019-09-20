package com.fanke.Thread.第一章;

public class SynchronizedObject {

    synchronized  public void printString(){
        System.out.println("begin");
        if(Thread.currentThread().getName().equals("a")){
            System.out.println("a线程永远 suspend了！");
            Thread.currentThread().suspend();
        }
        System.out.println("end");
    }

    public static void main(String[] args) {
        try{
            final SynchronizedObject object = new SynchronizedObject();
            Thread thread1 = new Thread(){
                @Override
                public void run(){
                    object.printString();
                }
            };
            thread1.setName("a");
            thread1.start();

            thread1.sleep(1000);
            Thread thread2 = new Thread(){
                @Override
                public void run(){
                    System.out.println("thread2启动了，但进入不了printString方法只打印1个begin");
                    System.out.println();
                 }
             };
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
