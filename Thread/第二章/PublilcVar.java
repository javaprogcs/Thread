package com.fanke.Thread.第二章;

import java.security.PublicKey;

public class PublilcVar {

    public String username = "A";
    public String password = "AA";

    synchronized public void setValue(String username,String password){
        try{
            this.username = username;
            Thread.sleep(5000);
            this.password = password;
            System.out.println("setValue method thread name=" + Thread.currentThread().getName() + "username" +username
            +  "password" + password);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    synchronized public void getValue(){
        System.out.println("getValue method thread name=" + Thread.currentThread().getName() + "username" + username
        + "password" + password);
    }
}

class Thread_Var extends  Thread{
    private PublilcVar publilcVar;

    public Thread_Var(PublilcVar publilcVar){
        super();
        this.publilcVar = publilcVar;
    }

    @Override
    public void run(){
        super.run();
        publilcVar.setValue("B","BB");
    }
}

class Test{
    public static void main(String[] args) {
        try{
            PublilcVar publilcVar = new PublilcVar();
            Thread_Var thread_var = new Thread_Var(publilcVar);
            thread_var.start();

            Thread.sleep(200);//输出结果受此值大小影响

            publilcVar.getValue();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
