package com.fanke.Thread.第三章.p_r_test;

/**
 * 消费者
 */
public class C {
    private String lock;

    public C(String lock){
        super();
        this.lock = lock;
    }

    public void getValue(){
        try{
            synchronized (lock){
                if(ValueObject.value.equals("")){
                    lock.wait();
                }
                System.out.println("get值是" + ValueObject.value);
                ValueObject.value = "";
                lock.notify();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
