package com.fanke.Thread.第三章.waitReleaseLock;

public class Service {

    public void testMethod(Object lock){
        try{
            synchronized (lock) {
                System.out.println("begin wait()");
                //lock.wait();//立即释放锁
                Thread.sleep(1000);//不释放锁
                System.out.println("  end wait()");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
