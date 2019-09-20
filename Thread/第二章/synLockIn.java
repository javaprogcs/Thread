package com.fanke.Thread.第二章;

public class synLockIn {
    public int i = 10;

    synchronized public void operateIMainMethod(){
        try{
            i--;
            System.out.println("main print i=" + i);
            Thread.sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

class Sub extends synLockIn{
    synchronized public void operateISubMethod(){
        try{
            while(i > 0){
                i--;
                System.out.println("sub print i=" + i);
                Thread.sleep(100);
                super.operateIMainMethod();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

class MyThread extends Thread{
    @Override
    public void run(){
        Sub sub = new Sub();
        sub.operateISubMethod();
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}


