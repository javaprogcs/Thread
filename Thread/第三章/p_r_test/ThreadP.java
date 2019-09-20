package com.fanke.Thread.第三章.p_r_test;

/**
 * 生产者线程
 */
public class ThreadP extends Thread{

    private P p;

    public ThreadP(P p){
        super();
        this.p = p;
    }

    @Override
    public void run(){
        while (true){
            p.setValue();
        }
    }
}
