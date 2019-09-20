package com.fanke.Thread.第一章;

public class Thread_for_interrupted_Exception  extends  Thread{

    @Override
    public void run(){
        super.run();
        try {
            for (int i = 0; i < 500000; i++) {
                if(this.interrupted()){
                    System.out.println("已经是停止状态了，我要退出！");
                    throw new InterruptedException();
                }
                System.out.println("i=" + (i + 1));
            }
            System.out.println("我在for下面");
        }catch (InterruptedException e){
            System.out.println("进入Thread.java类run方法中的catch了！ ");
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        try{
            Thread_for_interrupted_Exception thread_for_interrupted = new Thread_for_interrupted_Exception();
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
