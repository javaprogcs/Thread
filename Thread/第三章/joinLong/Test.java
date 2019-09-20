package com.fanke.Thread.第三章.joinLong;

public class Test {

    public static void main(String[] args) {
        try{
            MyThread myThread = new MyThread();
            myThread.start();

            System.out.println("        main    begin   time=" + System.currentTimeMillis());
            myThread.join(2000);//只等2S
            System.out.println("        main    end     time=" + System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
