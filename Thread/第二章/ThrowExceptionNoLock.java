package com.fanke.Thread.第二章;

public class ThrowExceptionNoLock {
    synchronized public void testMethod(){
        if(Thread.currentThread().getName().equals("a")){
            System.out.println("ThreadName=" + Thread.currentThread().getName() + "run beginTime=" + System.currentTimeMillis());
            int i = 1;
            while (i == 1){
                if(("" + Math.random()).substring(0,8).equals("0.123456")){
                    System.out.println("ThreadName=" + Thread.currentThread().getName() + "run exceptionTime=" + System.currentTimeMillis());
                    Integer.parseInt("a");
                }
            }
        }else{
            System.out.println("Thread B run Time=" + System.currentTimeMillis());
        }
    }
}

class ThrowThread extends  Thread{
    private ThrowExceptionNoLock t;

    public ThrowThread(ThrowExceptionNoLock t){
        super();
        this.t = t;
    }

    @Override
    public void run(){
        t.testMethod();
    }
}

class ThrowThread2 extends  Thread{
    private ThrowExceptionNoLock t;

    public ThrowThread2(ThrowExceptionNoLock t){
        super();
        this.t = t;
    }

    @Override
    public void run(){
        t.testMethod();
    }

    public static void main(String[] args) {
        try{
            ThrowExceptionNoLock lock = new ThrowExceptionNoLock();

            ThrowThread thread = new ThrowThread(lock);
            thread.setName("a");
            thread.start();

            Thread.sleep(100);

            ThrowThread2 throwThread2 = new ThrowThread2(lock);
            throwThread2.setName("b");
            throwThread2.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}


