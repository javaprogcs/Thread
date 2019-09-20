package com.fanke.Thread.第三章.ThreadLocal33;

import java.util.Date;

public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue(){
        return new Date().getTime();
    }
}
