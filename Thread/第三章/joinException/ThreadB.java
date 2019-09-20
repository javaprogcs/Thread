package com.fanke.Thread.第三章.joinException;

public class ThreadB extends Thread {
    @Override
    public void run(){
        try{
            ThreadA threadA = new ThreadA();
            threadA.start();
            threadA.join();

            System.out.println("线程B在RUN end处打印了");
        }catch (InterruptedException e){
            System.out.println("线程B在catch处打印了");
            e.printStackTrace();
        }
    }
}
