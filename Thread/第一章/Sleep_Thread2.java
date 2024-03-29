package com.fanke.Thread.第一章;

public class Sleep_Thread2 extends  Thread {

    @Override
    public void run(){
        try{
            for (int i = 0; i < 100000; i++) {
                System.out.println("i=" +  (i + 1) );
            }
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");
        }catch (InterruptedException e){
            System.out.println("先停止，再遇到了sleep！进入catch!");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Sleep_Thread2 thread2 = new Sleep_Thread2();
        thread2.start();
        thread2.interrupt();
        System.out.println("end!");
    }
}
