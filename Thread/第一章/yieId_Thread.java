package com.fanke.Thread.第一章;

public class yieId_Thread extends  Thread {

    @Override
    public void run(){
        long beginTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < 5000000; i++) {
            //Thread.yield();使用之后将CPU让给其他资源，速度变的很慢
            count = count + (i + 1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时：" + (endTime - beginTime) + "毫秒！ ");
    }

    public static void main(String[] args) {

        yieId_Thread yieId_thread = new yieId_Thread();
        yieId_thread.start();

    }
}
