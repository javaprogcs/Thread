package com.fanke.Thread.第二章;

public class Task {

    private String getData1;
    private String getData2;

    public synchronized void doLongTimeTask() {
        try{
            System.out.println("begin task");
            Thread.sleep(1000);
            getData1 = "长时间处理任务后从远程返回的值1 threadNmae=" +Thread.currentThread().getName();
            getData2 = "长时间处理任务后从远程返回的值2 threadNmae=" +Thread.currentThread().getName();

//            System.out.println(getData1);
//            System.out.println(getData2);
//            System.out.println("end task");

            synchronized (this){
                System.out.println(getData1);
                System.out.println(getData2);
                System.out.println("end task");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

class CommonUtils{
    public static long beginTime1;
    public static long endTime1;

    public static long beginTime2;
    public static long endTime2;
}

class MyThreadTask1 extends Thread{
    private Task task;
    public MyThreadTask1(Task task){
        super();
        this.task = task;
    }

    @Override
    public void run(){
        super.run();
        CommonUtils.beginTime1 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtils.endTime1 = System.currentTimeMillis();
    }
}


class MyThreadTask2 extends Thread{
    private Task task;
    public MyThreadTask2(Task task){
        super();
        this.task = task;
    }

    @Override
    public void run(){
        super.run();
        CommonUtils.beginTime2 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtils.endTime2 = System.currentTimeMillis();
    }

    public static void main(String[] args) {
        Task task = new Task();

        MyThreadTask1 task1 = new MyThreadTask1(task);
        task1.start();

        MyThreadTask2 task2 = new MyThreadTask2(task);
        task2.start();

        try{
            Thread.sleep(10000);

        }catch (InterruptedException e){
            e.printStackTrace();
        }

        long beginTime = CommonUtils.beginTime1;
        if(CommonUtils.beginTime2 < CommonUtils.beginTime1){
            beginTime = CommonUtils.beginTime2;
        }

        long endTime = CommonUtils.endTime1;
        if(CommonUtils.endTime2 < CommonUtils.endTime1){
            endTime = CommonUtils.endTime2;
        }
        System.out.println("耗时：" + ((endTime - beginTime) / 1000));

    }
}

