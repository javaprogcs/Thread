package com.fanke.Thread.第三章.waitReleaseLock;

public class Test {
    public static void main(String[] args) {
        Object lock = new Object();

        ThreadA a = new ThreadA(lock);
        a.start();

        ThreadB b = new ThreadB(lock);
        b.start();

    }
}
