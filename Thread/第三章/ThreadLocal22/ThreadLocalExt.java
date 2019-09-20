package com.fanke.Thread.第三章.ThreadLocal22;

public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue(){
        return "我是默认值   第一次get不再为null";
    }
}
