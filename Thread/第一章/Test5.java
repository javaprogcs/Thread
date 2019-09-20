package com.fanke.Thread.第一章;

public class Test5 {
    public static void main(String[] args) {
        Thread runThread = Thread.currentThread();
        System.out.println(runThread.getName() + " " + runThread.getId()); //getId取得线程的唯一标识
    }
}
