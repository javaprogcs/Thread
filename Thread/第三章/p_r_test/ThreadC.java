package com.fanke.Thread.第三章.p_r_test;

/**
 * 消费者线程
 */
public class ThreadC extends Thread{
    private C c;

    public ThreadC(C c){
        super();
        this.c = c;
    }

    @Override
    public void run(){
        while (true){
            c.getValue();
        }
    }
}
