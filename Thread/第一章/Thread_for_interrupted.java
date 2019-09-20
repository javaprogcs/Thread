package com.fanke.Thread.第一章;

public class Thread_for_interrupted extends  Thread {

    @Override
    public void run(){
        for (int i = 0; i < 500000; i++) {
            if(this.interrupted()){
                System.out.println("已经是停止状态了，我要退出！");
                break;
            }
            System.out.println("i=" + (i + 1));
        }
    }

    public static void main(String[] args) {
        try{
            Thread_for_interrupted thread_for_interrupted = new Thread_for_interrupted();
            thread_for_interrupted.start();
            thread_for_interrupted.sleep(1000);
            thread_for_interrupted.interrupt();
        }catch (InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
