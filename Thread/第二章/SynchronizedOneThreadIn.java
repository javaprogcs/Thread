package com.fanke.Thread.第二章;

public class SynchronizedOneThreadIn {

    public void serviceMethod(){
        try{
            synchronized (this) {
                System.out.println("begin time=" + System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("end end=" + System.currentTimeMillis());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

class ThreadA1 extends Thread{
    private  SynchronizedOneThreadIn service;

    public ThreadA1(SynchronizedOneThreadIn service){
        super();
        this.service = service;
    }

    @Override
    public void run(){
        super.run();
        service.serviceMethod();
    }
}

class ThreadB2 extends Thread{
    private  SynchronizedOneThreadIn service;

    public ThreadB2(SynchronizedOneThreadIn service){
        super();
        this.service = service;
    }

    @Override
    public void run(){
        super.run();
        service.serviceMethod();
    }

    public static void main(String[] args) {
        SynchronizedOneThreadIn thread = new SynchronizedOneThreadIn();

        ThreadA1 a1 = new ThreadA1(thread);
        a1.setName("a");
        a1.start();

        ThreadB2 a2 = new ThreadB2(thread);
        a2.setName("b");
        a2.start();
    }
}
