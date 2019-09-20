package com.fanke.Thread.第三章.waitInterruptException;

import static com.sun.corba.se.impl.util.Utility.printStackTrace;

public class Test {

    public static void main(String[] args) {
        try{
            Object o = new Object();

            ThreadA a = new ThreadA(o);
            a.start();

            Thread.sleep(5000);

            a.interrupt();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
