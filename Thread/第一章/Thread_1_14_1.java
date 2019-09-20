package com.fanke.Thread.第一章;

public class Thread_1_14_1 extends Thread{

    @Override
    public void run(){
        System.out.println("MyThread1 run priority=" + this.getPriority());
        Thread_1_14_1_2 thread_1_14_1 = new Thread_1_14_1_2();
        thread_1_14_1.start();

    }

    public static void main(String[] args) {
        System.out.println("main thread begin priority=" + Thread.currentThread().getPriority());
        //Thread.currentThread().setPriority(6);
        System.out.println("main thread end priority=" + Thread.currentThread().getPriority());
        Thread_1_14_1 thread1141 = new Thread_1_14_1();
        thread1141.start();
    }

}

class Thread_1_14_1_2 extends  Thread{

    @Override
    public void run(){
        System.out.println("MyThrad2 run priority=" + this.getPriority());
    }
}
