package com.fanke.Thread.第四章.z3_ok;

public class Run {

    public static void main(String[] args) {

        MyService service = new MyService();
        MyThreadA a = new MyThreadA(service);
        a.start();
        MyThreadA b = new MyThreadA(service);
        b.start();
        MyThreadA c = new MyThreadA(service);
        c.start();

    }
}
