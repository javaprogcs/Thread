package com.fanke.Thread.第一章;

public class suspend_resume_test extends Thread {

    private long i = 0;

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }

    @Override
    public void run(){
        while (true){
            i++;
        }
    }

    public static void main(String[] args) {
        try{
            suspend_resume_test suspendResumeTest = new suspend_resume_test();
            suspendResumeTest.start();
            Thread.sleep(1000);
            //A段
            suspendResumeTest.suspend();
            System.out.println("A=" + System.currentTimeMillis() + "i=" + suspendResumeTest.getI());
            Thread.sleep(5000);
            System.out.println("A=" + System.currentTimeMillis() + "i=" + suspendResumeTest.getI());

            //B段
            suspendResumeTest.resume();
            Thread.sleep(5000);
            System.out.println("A=" + System.currentTimeMillis() + "i=" + suspendResumeTest.getI());
            //c段
            suspendResumeTest.suspend();
            System.out.println("A=" + System.currentTimeMillis() + "i=" + suspendResumeTest.getI());
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
