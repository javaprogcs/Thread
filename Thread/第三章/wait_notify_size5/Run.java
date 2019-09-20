package com.fanke.Thread.第三章.wait_notify_size5;

public class Run {
    public static void main(String[] args) {
        try{
            Object o = new Object();

            ThreadA a = new ThreadA(o);
            a.start();

            Thread.sleep(50);

            ThreadB b = new ThreadB(o);
            b.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
