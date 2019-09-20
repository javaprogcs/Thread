package com.fanke.Thread.第四章.ConditionTest;

public class Run {

    public static void main(String[] args) {
        MyService service = new MyService();

        ThreadA a = new ThreadA(service);
        a.start();

        ThreadB b = new ThreadB(service);
        b.start();
    }
}
