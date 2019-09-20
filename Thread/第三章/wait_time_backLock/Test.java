package com.fanke.Thread.第三章.wait_time_backLock;

import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException,InterruptedException {
        MyService service = new MyService();

        MyThreadA[] array = new MyThreadA[10];

        for (int i = 0; i < 10; i++) {
            array[i] = new MyThreadA(service);
        }

        for (int i = 0; i < 10; i++) {
            array[i].start();
        }

        MyThreadB b = new MyThreadB(service);
        b.start();
    }
}
