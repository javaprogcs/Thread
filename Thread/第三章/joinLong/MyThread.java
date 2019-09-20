package com.fanke.Thread.第三章.joinLong;

public class MyThread extends Thread{

    @Override
    public void run(){
        try{
            System.out.println("run begin timer=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("run end time Timer=" + System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
