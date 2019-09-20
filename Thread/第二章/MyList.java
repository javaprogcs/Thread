package com.fanke.Thread.第二章;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    private List list = new ArrayList();

    synchronized public void add(String username){
        System.out.println("ThreadName=" + Thread.currentThread().getName() + "执行了add方法！");
        list.add(username);
        System.out.println("ThreadName=" + Thread.currentThread().getName() + "退出了add方法");
    }

    synchronized  public int getSize(){
        System.out.println("ThreadName=" + Thread.currentThread().getName() + "执行了getSize()方法！");
        int sizeValue = list.size();
        System.out.println("ThreadName=" + Thread.currentThread().getName() + "退出了getSize()方法！");
        return sizeValue;

    }
}

class MyThreadList extends  Thread{
    private MyList list;

    public MyThreadList(MyList list){
        super();
        this.list = list;
    }

    @Override
    public void run(){
        for (int i = 0; i < 100000; i++) {
            list.add("ThreadA" + (i + 1));
        }
    }
}


class MyThreadList1 extends  Thread{
    private MyList list;

    public MyThreadList1(MyList list){
        super();
        this.list = list;
    }

    @Override
    public void run(){
        for (int i = 0; i < 100000; i++) {
            list.add("ThreadA" + (i + 1));
        }
    }

    public static void main(String[] args) {
        MyList list = new MyList();

        MyThreadList a = new MyThreadList(list);
        a.setName("A");
        a.start();

        MyThreadList1 b = new MyThreadList1(list);
        b.setName("B");
        b.start();
    }
}
