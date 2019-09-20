package com.fanke.Thread.第一章;

public class Test2 {

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
        StackTraceElement[] array = Thread.currentThread().getStackTrace(); //currentThread().getStackTrace()的作用是返回一个表示该线程堆栈跟踪元素数组
        if(array != null){
            for(int i = 0; i < array.length; i++){
                StackTraceElement element = array[i];
                System.out.println("ClassName=" + element.getClassName() + " methodName=" + element.getMethodName()
                + " fileName=" + element.getFileName() + " LineNumber=" + element.getLineNumber());
            }
        }
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.a();
    }

}