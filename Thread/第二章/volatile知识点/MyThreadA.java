package com.fanke.Thread.第二章.volatile知识点;


class MyServiceThread{
    volatile public long i;
}
public class MyThreadA extends  Thread {

    private MyServiceThread myServiceThread;

    public MyThreadA(MyServiceThread myServiceThread){
        super();
        this.myServiceThread = myServiceThread;
    }

    @Override
    public void run() {
        while (true) {
            myServiceThread.i = 1;
        }
    }
}

class MyThreadB extends  Thread {
    private MyServiceThread myServiceThread;

    public MyThreadB(MyServiceThread myServiceThread){
        super();
        this.myServiceThread = myServiceThread;
    }

    @Override
    public void run() {
        while (true) {
            myServiceThread.i = -1;
        }
    }

    public static void main(String[] args) {
        try{
            MyServiceThread thread = new MyServiceThread();
            MyThreadA a = new MyThreadA(thread);
            MyThreadB b = new MyThreadB(thread);

            a.start();
            b.start();
            Thread.sleep(1000);
            System.out.println("long 1 二进制值是：" + Long.toBinaryString(1));
            System.out.println("long -1 二进制值是：" + Long.toBinaryString(-1));

            while (true) {
                long getValue = thread.i;
                if(getValue != 1 && getValue != -1){
                    System.out.println("  i的值是：" + Long.toBinaryString(getValue) + "十进制是：" + getValue);
                    System.exit(0);
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
