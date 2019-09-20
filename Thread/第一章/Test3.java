package com.fanke.Thread.第一章;

public class Test3 {
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
        int age = 0;
        age = 100;
        if(age == 100){
            Thread.dumpStack(); //将当前线程的堆栈跟踪信息输出至标准错误流
        }
    }

    public static void main(String[] args) {
        Test3 test3 = new Test3();
        test3.a();
    }
}
