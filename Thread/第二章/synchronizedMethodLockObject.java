package com.fanke.Thread.第二章;

public class synchronizedMethodLockObject {

    synchronized public void methodA(){

            try{
                System.out.println("begin methodA threadName=" + Thread.currentThread().getName());
                Thread.sleep(5000);
                System.out.println("end endTime=" + System.currentTimeMillis());

            }catch (InterruptedException e){
                e.printStackTrace();
            }
    }

    synchronized public void methodB(){

        try{
            System.out.println("begin methodB threadName=" + Thread.currentThread().getName() + "" + "begin time="
            + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("end");

        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}

class ThreadSynchronized1 extends  Thread{
    private synchronizedMethodLockObject synchronziedObject;

    public ThreadSynchronized1(synchronizedMethodLockObject synchronziedObject){
        super();
        this.synchronziedObject = synchronziedObject;
    }

    @Override
    public void run(){
        super.run();
        synchronziedObject.methodA();
    }
}

class ThreadSynchronized2 extends  Thread{
    private synchronizedMethodLockObject synchronziedObject;

    public ThreadSynchronized2(synchronizedMethodLockObject synchronziedObject){
        super();
        this.synchronziedObject = synchronziedObject;
    }

    @Override
    public void run(){
        super.run();
        synchronziedObject.methodB();
    }
}

class Run{
    public static void main(String[] args) {
        synchronizedMethodLockObject object = new synchronizedMethodLockObject();
        ThreadSynchronized1 synchronized1 = new ThreadSynchronized1(object);
        synchronized1.setName("A");

        ThreadSynchronized2 synchronized2 = new ThreadSynchronized2(object);
        synchronized2.setName("B");

        synchronized1.start();
        synchronized2.start();
    }
}