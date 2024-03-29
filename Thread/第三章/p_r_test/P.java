package com.fanke.Thread.第三章.p_r_test;



/**
 * @Author chengshengwen
 * 生产者
 */
public class P {
    private String lock;

    public P(String lock){
        super();
        this.lock = lock;
    }

    public void setValue() {
        try{
            synchronized (lock){
                if(!ValueObject.value.equals("")){
                    lock.wait();
                }

                String value = System.currentTimeMillis() + "__" + System.nanoTime();
                System.out.println("set的值是" + value);
                ValueObject.value = value;
                lock.notify();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
