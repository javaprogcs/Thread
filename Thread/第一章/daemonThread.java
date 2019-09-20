package com.fanke.Thread.第一章;

public class daemonThread extends Thread {

    private  int i = 0;

    @Override
    public void run(){
        try{
            while (true){
                i++;
                System.out.println("i=" + (i));
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

class  Run extends  Thread{
    public static void main(String[] args) {
        try{
            daemonThread daemonThread = new daemonThread();
            daemonThread.setDaemon(true);
            daemonThread.start();
            daemonThread.sleep(5000);
            System.out.println("我离开thread对象也不再打印了，也就是停止了！");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}