package com.fanke.Thread.第二章;

public class HasSelfPrivarteNum {
    private int num = 0;

    synchronized public void addI(String username){
        try{
            if(username.equals("a")){
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(2000);
            }else{
                num = 200;
                System.out.println("b set over!");
            }
            System.out.println(username + " num=" + num);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        HasSelfPrivarteNum num = new HasSelfPrivarteNum();

        ThreadA_2 threadA_2 = new ThreadA_2(num);
        threadA_2.start();

        ThreadB_2 threadB_2 = new ThreadB_2(num);
        threadB_2.start();
    }
}

class ThreadA_2 extends Thread{

    private HasSelfPrivarteNum numRef;

    public ThreadA_2(HasSelfPrivarteNum numRef){
        super();
        this.numRef = numRef;
    }

    @Override
    public void run(){
        super.run();
        numRef.addI("a");
    }
}

class ThreadB_2 extends Thread{
    private HasSelfPrivarteNum numRef;

    public ThreadB_2(HasSelfPrivarteNum numRef){
        super();
        this.numRef = numRef;
    }

    @Override
    public void run(){
        super.run();
        numRef.addI("b");
    }
}

