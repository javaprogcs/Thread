package com.fanke.Thread.第一章;

public class Sleep_Thread1 extends Thread {

    @Override
    public void run(){
        super.run();
        try{
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");
        }catch (InterruptedException e){
            System.out.println("在沉睡中被停止！进入catch！" + this.isInterrupted());
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        try{
            Sleep_Thread1 thread1 = new Sleep_Thread1();
            thread1.start();
            Thread.sleep(200);
            thread1.interrupt();
        }catch (InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end！");
    }
}
