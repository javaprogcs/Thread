package com.fanke.Thread.第一章;

public class Test_1_2_4 extends Thread{
    private int i;

    public Test_1_2_4(int i){
        super();
        this.i = i;
    }

    @Override
    public void run(){
        System.out.println(i);
    }

    public static void main(String[] args) {

        Test_1_2_4 test124 = new Test_1_2_4(1);
        Test_1_2_4 test125 = new Test_1_2_4(2);
        Test_1_2_4 test126 = new Test_1_2_4(3);
        Test_1_2_4 test127 = new Test_1_2_4(4);
        Test_1_2_4 test128 = new Test_1_2_4(5);

        test124.start();
        test125.start();
        test126.start();
        test127.start();
        test128.start();
    }

}

