package com.fanke.Thread.第三章.waitOld;

public class ThreadB extends Thread {
    private Subtract r;

    public ThreadB(Subtract r){
        super();
        this.r = r;
    }

    @Override
    public void run(){
        r.subtract();
    }
}
