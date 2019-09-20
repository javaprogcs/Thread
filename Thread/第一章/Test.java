package com.fanke.Thread.第一章;

public class Test {
    public static void main(String[] args) throws InterruptedException{

            Long beginTime =  System.currentTimeMillis();
            Thread.currentThread().sleep(200,900);//sleep(long millis,int nanos)在指定的毫秒数加指定的纳秒数内让当前正在执行的线程休眠
            Long endTime = System.currentTimeMillis();
        System.out.println(endTime - beginTime);
    }
}
