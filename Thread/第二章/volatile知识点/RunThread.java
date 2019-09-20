package com.fanke.Thread.第二章.volatile知识点;

public class RunThread extends Thread {

    volatile private boolean isRunning = true;

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean isRunning){
        this.isRunning = isRunning;
    }

    @Override
    public void run() {
        System.out.println("进入RUN了");
        while (isRunning == true) {

        }
        System.out.println("线程被停止了！");
    }

    public static void main(String[] args) {
        try{
            RunThread runThread = new RunThread();
            runThread.start();
            Thread.sleep(1000);
            runThread.setRunning(false);
            System.out.println("已经赋值为false");
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
