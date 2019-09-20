package com.fanke.Thread.第三章.ThreadLocalTest;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException,InterruptedException {
        MyThreadA a = new MyThreadA();
        MyThreadB b = new MyThreadB();

        a.start();
        b.start();
        for (int i = 0; i < 10; i++) {
            Tools.t1.set("main" + (i + 1));
            System.out.println("                main  get " + Tools.t1.get());
            int sleepValue = (int) (Math.random() * 1000);
            Thread.sleep(sleepValue);
        }
    }
}
