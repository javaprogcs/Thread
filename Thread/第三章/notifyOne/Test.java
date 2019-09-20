package com.fanke.Thread.第三章.notifyOne;

public class Test {

    public static void main(String[] args) throws InterruptedException{

            MyService service = new MyService();

            for (int i = 0; i < 10; i++) {
                MyThreadA a = new MyThreadA(service);
                a.start();
            }

            Thread.sleep(1000);

            MyThreadB b1 = new MyThreadB(service);
            b1.start();

    }
}
