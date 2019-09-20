package com.fanke.Thread.第三章.WaitAndNotify;

import com.fanke.Thread.第二章.volatile知识点.MyThreadA;

public class Test {

    public static void main(String[] args) {
        try{
            Object o = new Object();

            MyThread1 thread1 = new MyThread1(o);
            thread1.start();

            Thread.sleep(3000);

            MyThread2 thread2 = new MyThread2(o);
            thread2.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
