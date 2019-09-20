package com.fanke.Thread.第二章;

public class HasSelfPrivateNum {

    public void addI(String username){
        try{
            int num = 0;
            if(username.equals("a")){
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(2000);
            }else {
                num = 2000;
                System.out.println("b seet over!");
            }
            System.out.println(username + "num=" + num);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        HasSelfPrivateNum hasSelfPrivateNum = new HasSelfPrivateNum();

        ThreadA threadA = new ThreadA(hasSelfPrivateNum);
        threadA.start();

        ThreadB threadB = new ThreadB(hasSelfPrivateNum);
        threadB.start();

    }
}

class ThreadA extends Thread{

    private HasSelfPrivateNum numRef;

    public ThreadA(HasSelfPrivateNum numRef){
        super();
        this.numRef = numRef;
    }

    @Override
    public void run(){
        super.run();
        numRef.addI("a");
    }
}

class ThreadB extends  Thread{
    private HasSelfPrivateNum numRef;

    public ThreadB(HasSelfPrivateNum numRef){
        super();
        this.numRef = numRef;
    }

    @Override
    public void run(){
        super.run();
        numRef.addI("b");
    }
}
