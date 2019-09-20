package com.fanke.Thread.第六章.singleton_5;

public class MyObject {

    private volatile static MyObject myObject;

    private MyObject(){}

    public static MyObject getInstance(){
        try{
            //此种方法等同于
            //synchronized public static MyObject getInstance()的写法，效率一样很低，全部代码被同步

                if(myObject != null){

                }else{
                    //模拟在创建对象之前做一些准备性的工作
                    Thread.sleep(3000);
                    synchronized (MyObject.class) {
                        if(myObject == null){
                            myObject = new MyObject();
                        }
                    }
                }

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return myObject;
    }
}
