package com.fanke.Thread.第二章.volatile知识点;

public class Service {

    private boolean isContinueRun = true;

    public void runMethod() {
        String s = new String();
        while (isContinueRun == true) {
            synchronized (s){

            }
        }
        System.out.println("停下来了");
    }

    public void stopMethod() {
        isContinueRun = false;
    }
}

class ThreadB extends  Thread {
    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.stopMethod();
    }
}

class ThreadA extends  Thread {
    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.runMethod();
    }

    public static void main(String[] args) {
        try{
            Service service = new Service();

            ThreadA a = new ThreadA(service);
            a.start();

            Thread.sleep(1000);

            ThreadB b = new ThreadB(service);
            b.start();

            System.out.println("已经发起停止的命令了！");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}


