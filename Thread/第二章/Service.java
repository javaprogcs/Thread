package com.fanke.Thread.第二章;

public class Service {

    synchronized public void service1(){
        System.out.println("service1");
        service2();
    }

    synchronized public void service2(){
        System.out.println("service2");
        service3();
    }

    synchronized public void service3(){
        System.out.println("service3");
    }
}

class Service_MyThread extends  Thread{

    @Override
    public void run(){
        Service service = new Service();
        service.service1();
    }
}

class Main_Thread{
    public static void main(String[] args) {
        Service_MyThread service_myThread = new Service_MyThread();
        service_myThread.start();
    }
}
