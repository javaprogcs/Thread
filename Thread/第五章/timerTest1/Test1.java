package com.fanke.Thread.第五章.timerTest1;

import java.util.Date;
import java.util.Timer;

public class Test1 {

    public static void main(String[] args) throws InterruptedException{
        long nowTime = System.currentTimeMillis();
        System.out.println("当前时间为：" + nowTime);

        long scheduleTime = (nowTime + 10000);
        System.out.println("计划时间为：" + scheduleTime);

        MyTask task = new MyTask();

        Timer timer = new Timer();
        Thread.sleep(1000);
        timer.schedule(task,new Date(scheduleTime));

        Thread.sleep(Integer.MAX_VALUE);
    }
}
