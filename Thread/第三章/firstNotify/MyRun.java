package com.fanke.Thread.第三章.firstNotify;

public class MyRun {
    private String lock = new String("");

    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock) {
                    System.out.println("begin wait");
                    lock.wait();
                    System.out.println("end wait");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    private Runnable runnable1 = new Runnable() {
        @Override
        public void run() {
            synchronized (lock) {
                System.out.println("begin notify");
                lock.notify();
                System.out.println("end notify");
            }
        }
    };

    public static void main(String[] args) throws InterruptedException{
        MyRun run = new MyRun();

        Thread thread = new Thread(run.runnable);
        thread.start();

        Thread.sleep(1000);

        Thread thread1 = new Thread(run.runnable1);
        thread1.start();

    }
}


