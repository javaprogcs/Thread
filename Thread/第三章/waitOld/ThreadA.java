package com.fanke.Thread.第三章.waitOld;

public class ThreadA    extends Thread {
    private Add p;

    public ThreadA(Add p){
        super();
        this.p = p;
    }

    @Override
    public void run(){
        p.add();
    }
}
