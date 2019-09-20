package com.fanke.Thread.第二章.synchronized三种结论.p3;


class MyObjectData{
      public void speedPrintString() {
          synchronized (this){
              System.out.println("testMethod1 ____getLock time=" + System.currentTimeMillis() + "run ThreadName=" + Thread.currentThread().getName());
              System.out.println("-----------------------");
              System.out.println("testMethod1 releaseLock time=" + System.currentTimeMillis() + "run ThreadName=" + Thread.currentThread().getName());
          }

    }
}

public class MyService {

    public void testMethod1(MyObjectData myObjectData) {
        synchronized (myObjectData) {
            try {
                System.out.println("testMethod1 ____getLock time=" + System.currentTimeMillis() + "run ThreadName=" + Thread.currentThread().getName());
                Thread.sleep(2000);
                System.out.println("testMethod1 releaseLock time=" + System.currentTimeMillis() + "run ThreadName=" + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadA extends Thread{

       private MyService myService;
       private MyObjectData objectData;

       public ThreadA(MyService myService, MyObjectData objectData){
           super();
           this.myService = myService;
           this.objectData = objectData;
       }

       @Override
       public void run() {
           super.run();
           myService.testMethod1(objectData);
       }
   }


class ThreadB extends Thread{

    private MyObjectData objectData;

    public ThreadB( MyObjectData objectData){
        super();
        this.objectData = objectData;
    }

    @Override
    public void run() {
        super.run();
        objectData.speedPrintString();
    }
}

class Run_1_1{
    public static void main(String[] args) throws InterruptedException{
        MyService myService = new MyService();
        MyObjectData myObjectData = new MyObjectData();
        //MyObjectData myObjectData1 = new MyObjectData();


        ThreadA threadA = new ThreadA(myService,myObjectData);
        threadA.setName("a");
        threadA.start();

        Thread.sleep(100);
        ThreadB threadB = new ThreadB(myObjectData);
        threadB.setName("B");
        threadB.start();
    }
}

