package com.fanke.Thread.第二章;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 集合工具类
 */
public class MyOneList {
    private List list = new ArrayList();

    synchronized public void add(String data){
        list.add(data);
    };

    synchronized public int getSize() {
        return list.size();
    }
}

/**
 * 业务类
 */
class MyService{

    public MyOneList addServiceMethod(MyOneList list, String data){
        try{

            synchronized (list){
                if(list.getSize() < 1){
                    Thread.sleep(2000); //模拟从远程端花费2s取回数据
                    list.add(data);
                }
            }

        } catch (InterruptedException e){
            e.printStackTrace();
        }
        return  list;
    }
}

/**
 * 线程类
 */
class MyThread1 extends Thread{

    private MyOneList list;

    public MyThread1(MyOneList list){
        super();
        this.list = list;
    }

    @Override
    public void run(){
        MyService service = new MyService();
        service.addServiceMethod(list,"A");
    }
}

/**
 * 线程类
 */
class MyThread2 extends Thread{

    private MyOneList list;

    public MyThread2(MyOneList list){
        super();
        this.list = list;
    }

    @Override
    public void run(){
        MyService service = new MyService();
        service.addServiceMethod(list,"B");
    }
}

/**
 * 测试类
 */

class MyRun{
    public static void main(String[] args) throws InterruptedException{
        MyOneList myOneList = new MyOneList();

        MyThread1 myThread = new MyThread1(myOneList);
        myThread.setName("A");
        myThread.start();

        MyThread2 thread2 = new MyThread2(myOneList);
        thread2.setName("B");
        thread2.start();

        Thread.sleep(6000);

        System.out.println("listSize=" + myOneList.getSize());
    }
}
