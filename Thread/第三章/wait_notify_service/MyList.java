package com.fanke.Thread.第三章.wait_notify_service;

import java.util.ArrayList;
import java.util.List;

public class MyList {

    volatile private List list = new ArrayList();

    public void add() {
        list.add("anyString");
    }

    public int size() {
        return list.size();
    }
}
