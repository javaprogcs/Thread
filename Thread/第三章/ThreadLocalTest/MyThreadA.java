package com.fanke.Thread.第三章.ThreadLocalTest;

public class MyThreadA extends Thread {
    @Override
    public void run(){
        try{
            for (int i = 0; i < 10; i++) {
                Tools.t1.set("A" + (i + 1));
                System.out.println("A get " + Tools.t1.get());
                int sleepValue = (int) (Math.random() * 1000);
                Thread.sleep(sleepValue);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
