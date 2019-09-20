package com.fanke.Thread.第一章;

public class Test_1_2_3 extends Thread{

    @Override
    public void run(){
        for(int i = 0; i < 10000; i++){
            System.out.println("run=" + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Test_1_2_3 test123 = new Test_1_2_3();
        test123.setName("MyThread");
        test123.start();//线程启动

        for(int i = 0; i < 10000; i++){
            System.out.println("main=" + Thread.currentThread().getName());
        }

    }

}
