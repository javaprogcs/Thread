package com.fanke.Thread.第三章.joinException;

public class Run {

    public static void main(String[] args) {
        try{
            ThreadB threadB = new ThreadB();
            threadB.start();

            Thread.sleep(500);

            ThreadC threadC = new ThreadC(threadB);
            threadC.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
