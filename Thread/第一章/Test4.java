package com.fanke.Thread.第一章;

import java.util.Iterator;
import java.util.Map;

public class Test4 {
    public void a(){
        b();
    }

    public void b(){
        c();
    }

    public void c(){
        d();
    }

    public void d(){
        e();
    }

    public void e() {
        Map<Thread,StackTraceElement[]> map = Thread.currentThread().getAllStackTraces(); //Thread.currentThread().getAllStackTraces() 的作用是返回所有活动线程的堆栈跟踪的一个映射
        if(map != null && map.size() != 0){
            Iterator iterator = map.keySet().iterator();
            while(iterator.hasNext()){
                Thread eachThread = (Thread) iterator.next();
                StackTraceElement[] array = map.get(eachThread);
                System.out.println("------------每个线程的基本信息");
                System.out.println("线程名称：" + eachThread.getName());
                System.out.println("StackTraceElement[].length=" + array.length);
                System.out.println("线程的状态：" + eachThread.getState());
                if(array.length != 0){
                    System.out.println("输出StackTraceElement[]数组具体信息：");
                    for(int i = 0; i < array.length; i++){
                        StackTraceElement element = array[i];
                        System.out.println("" + element.getClassName() + "" + element.getMethodName() + ""
                        + element.getFileName() + "" + element.getLineNumber());
                    }
                }else{
                    System.out.println("     没有StackTraceElement[]信息，因为线程" + eachThread.getName() +
                            "中的StackTraceElement[].length==0");
                }
                System.out.println();
                System.out.println();

            }
        }
    }

    public static void main(String[] args) {
        Test4 test4 = new Test4();
        test4.a();
    }
}
