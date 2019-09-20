package com.fanke.Thread.第二章.volatile知识点;

public class PringString implements Runnable{

    private boolean isContinuePrint = true;

    public boolean isContinuePrint() {
        return isContinuePrint;
    }

    public void setContinuePrint(boolean isContinuePrint){
        this.isContinuePrint = isContinuePrint;
    }

    public void printStringMethod(){
        try{
            while (isContinuePrint == true){
                System.out.println("run printStringMethod threadName=" + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public void run(){
        printStringMethod();
    }


    public static void main(String[] args) {
        PringString pringString = new PringString();
        new Thread(pringString).start();
        System.out.println("我要停止它！stopThread=" + Thread.currentThread().getName());
        pringString.setContinuePrint(false);
    }
}


