package com.fanke.Thread.第三章.ThreadLocal33;

public class Run {

    public static void main(String[] args) {
        try{
            for (int i = 0; i < 10; i++) {
                System.out.println("        在Main线程中取值=" + Tools.t1.get());
                Thread.sleep(100);
            }
            Thread.sleep(5000);
            Thread A = new Thread();
            A.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
