package com.fanke.Thread.第二章;

public class SynNotExtends {
    synchronized public void serviceMethod(){
        try{
            System.out.println("int main 下一步sleep begin threadName=" + Thread.currentThread().getName() + "time="
            + System.currentTimeMillis());

            Thread.sleep(5000);
            System.out.println("int main 下一步sleep end threadName=" + Thread.currentThread().getName() + "time="
            + System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

class SynExtends extends SynNotExtends{
    @Override
    synchronized public void serviceMethod(){
        try{
            System.out.println("int sub 下一步sleep begin threadName=" + Thread.currentThread().getName() + " time="
            + System.currentTimeMillis());

            Thread.sleep(5000);

            System.out.println("int sub 下一步sleep end threadName=" + Thread.currentThread().getName() + " time="
            + System.currentTimeMillis());
            super.serviceMethod();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

class MyThread_Sub1 extends Thread{

    private SynExtends synExtends;

    public MyThread_Sub1(SynExtends synExtends){
        super();
        this.synExtends = synExtends;
    }

    @Override
    public void run(){
        synExtends.serviceMethod();
    }
}

class MyThread_Sub2 extends Thread{

    private SynExtends synExtends;

    public MyThread_Sub2(SynExtends synExtends){
        super();
        this.synExtends = synExtends;
    }

    @Override
    public void run(){
        synExtends.serviceMethod();
    }

    public static void main(String[] args) {
        SynExtends synExtends = new SynExtends();

        MyThread_Sub1 myThread_sub1 = new MyThread_Sub1(synExtends);
        myThread_sub1.setName("A");
        myThread_sub1.start();

        MyThread_Sub2 sub2 = new MyThread_Sub2(synExtends);
        sub2.setName("B");
        sub2.start();
    }
}


