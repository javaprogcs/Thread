package com.fanke.Thread.第四章.UseConditionWaitNotifyError;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

    private Lock lock = new ReentrantLock();

    //Condition:控制线程状态，可以是wait()或者start()状态。
    private Condition condition = lock.newCondition();

    public void await(){
        try{
            condition.await();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
