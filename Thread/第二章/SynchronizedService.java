package com.fanke.Thread.第二章;

public class SynchronizedService {
    private String anyString = new String();

    public void a(){
        try{

            synchronized (anyString) {
                System.out.println("a begin");
                Thread.sleep(3000);
                System.out.println("a end");
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    synchronized public void b(){
        System.out.println("b begin");
        System.out.println("b end");
    }
}

class ThreadService extends Thread{
    private SynchronizedService synchronizedService;

    public ThreadService(SynchronizedService synchronizedService){
        super();
        this.synchronizedService = synchronizedService;
    }

    @Override
    public void run(){
        synchronizedService.a();
    }
}

class ThreadService2 extends Thread{
    private SynchronizedService synchronizedService;

    public ThreadService2(SynchronizedService synchronizedService){
        super();
        this.synchronizedService = synchronizedService;
    }

    @Override
    public void run(){
        synchronizedService.b();
    }

    public static void main(String[] args) {
        SynchronizedService service = new SynchronizedService();

        ThreadService threadService = new ThreadService(service);
        threadService.setName("A");
        threadService.start();

        ThreadService2 service2 = new ThreadService2(service);
        service2.setName("B");
        service2.start();
    }
}

