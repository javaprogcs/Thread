package com.fanke.Thread.第四章.ConditionTestMoreMethod;

public class Run {

    public static void main(String[] args) throws InterruptedException{
        MyService service = new MyService();

        ThreadA a = new ThreadA(service);
        a.setName("a");
        a.start();

        ThreadAA aa = new ThreadAA(service);
        aa.setName("aa");
        aa.start();

        Thread.sleep(2000);

        ThreadB b = new ThreadB(service);
        b.setName("b");
        b.start();

        ThreadBB bb = new ThreadBB(service);
        bb.setName("bb");
        bb.start();
    }
}
