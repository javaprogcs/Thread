package com.fanke.Thread.第一章;

public class Thread_countPriority extends  Thread{
    private int count = 0;

    public int getCount() {
        return count;
    }

    @Override
    public void run(){
        while(true){
            count++;
        }
    }

    public static void main(String[] args) {
        try{
            Thread_countPriority thread_countPriority = new Thread_countPriority();
            thread_countPriority.setPriority(Thread.NORM_PRIORITY - 3);
            thread_countPriority.start();

            Thread_countPriority_2 countPriority2 = new Thread_countPriority_2();
            countPriority2.setPriority(Thread.NORM_PRIORITY + 3);
            countPriority2.start();

            Thread.sleep(2000);
            thread_countPriority.stop();
            countPriority2.stop();

            System.out.println("thread_countPriority=" + thread_countPriority.getCount());
            System.out.println("countPriority2=" +countPriority2.getCount());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

class Thread_countPriority_2 extends Thread{
    private  int count = 0;

    public int getCount() {
        return count;
    }

    @Override
    public void run(){
        while(true){
            count++;
        }
    }

}
