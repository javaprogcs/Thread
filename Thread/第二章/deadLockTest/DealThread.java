package com.fanke.Thread.第二章.deadLockTest;

public class DealThread implements Runnable {

    public String username;
    public Object lock1 = new Object();
    public Object lock2 = new Object();

    public void setFlag(String username){
        this.username = username;
    }
    @Override
    public void run() {
        if(username.equals("a")) {
            synchronized (lock1) {
                try{
                    System.out.println("username = " + username);
                    Thread.sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                synchronized (lock2){
                    System.out.println("按lock1->lock2代码顺序执行了");
                }
            }
        }
        if(username.equals("b")) {
            try{
                synchronized (lock2) {
                    System.out.println("username = " + username);
                    Thread.sleep(3000);
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            synchronized (lock1) {
                System.out.println("按lock2->lock1代码顺序执行了");
            }
        }
    }
}
class run{
    public static void main(String[] args) {
        try{
            DealThread dealThread = new DealThread();
            dealThread.setFlag("a");

            Thread thread = new Thread(dealThread);
            thread.start();

            Thread.sleep(100);

            dealThread.setFlag("b");
            Thread thread1 = new Thread(dealThread);
            thread1.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
