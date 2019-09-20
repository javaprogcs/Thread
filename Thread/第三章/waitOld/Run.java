package com.fanke.Thread.第三章.waitOld;

public class Run {

    public static void main(String[] args) throws InterruptedException{
        String lock = new String("");

        Add add = new Add(lock);
        Subtract subtract = new Subtract(lock);

        ThreadB b = new ThreadB(subtract);
        b.setName("subtractThread");
        b.start();

        ThreadB b1 = new ThreadB(subtract);
        b1.setName("subtractThread");
        b1.start();

        Thread.sleep(1000);

        ThreadA a = new ThreadA(add);
        a.setName("AddThread");
        a.start();
    }
}
