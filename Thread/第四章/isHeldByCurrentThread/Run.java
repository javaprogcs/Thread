package com.fanke.Thread.第四章.isHeldByCurrentThread;

public class Run {

    public static void main(String[] args) throws InterruptedException{
        final  Service service = new Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.serviceMethod();
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }

}
