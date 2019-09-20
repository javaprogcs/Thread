package com.fanke.Thread.第二章;

public class twoObjectTwoLock {
    private int num = 0;

    synchronized public void  addI(String username){
        try{
            if(username.equals("a")){
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(2000);
            }else{
                num = 200;
                System.out.println("b set over!");
            }
            System.out.println(username + "num=" +num);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

class ThreadA_TWO extends Thread{
    private twoObjectTwoLock numRef;

    public ThreadA_TWO(twoObjectTwoLock numRef){
        super();
        this.numRef = numRef;
    }

    @Override
    public void run(){
        super.run();
        numRef.addI("a");
    }
}

class ThreadB_two extends Thread{
    private twoObjectTwoLock numRef;

    public ThreadB_two(twoObjectTwoLock numRef){
        super();
        this.numRef = numRef;
    }

    @Override
    public void run(){
        super.run();
        numRef.addI("b");
    }
}

class main{
    public static void main(String[] args) {
        twoObjectTwoLock twoLock = new twoObjectTwoLock();
        twoObjectTwoLock twoLock1 = new twoObjectTwoLock();

        ThreadA_TWO threadA_two = new ThreadA_TWO(twoLock);
        threadA_two.start();

        ThreadB_two threadB_two = new ThreadB_two(twoLock1);
        threadB_two.start();
    }
}
