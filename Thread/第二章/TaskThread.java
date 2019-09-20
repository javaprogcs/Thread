package com.fanke.Thread.第二章;

public class TaskThread {

    public void doLongTimeTask(){
        for (int i = 0; i < 100; i++) {
            System.out.println("nosnchronized threadName=" + Thread.currentThread().getName() + "i=" + (i + 1));
        }
        System.out.println("");
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                System.out.println("synchronized threadName=" + Thread.currentThread().getName() + "i=" + (i + 1));
            }
        }
    }
}

class MyThreadDo extends Thread{
    private TaskThread taskThread;

    public MyThreadDo(TaskThread taskThread){
        super();
        taskThread.doLongTimeTask();
    }
}


class MyThreadDo2 extends Thread{
    private TaskThread taskThread;

    public MyThreadDo2(TaskThread taskThread){
        super();
        taskThread.doLongTimeTask();
    }

    public static void main(String[] args) {
        TaskThread taskThread = new TaskThread();

        MyThreadDo myThreadDo = new MyThreadDo(taskThread);
        myThreadDo.start();

        MyThreadDo2 myThreadDo1 = new MyThreadDo2(taskThread);
        myThreadDo1.start();
    }
}
