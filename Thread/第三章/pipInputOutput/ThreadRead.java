package com.fanke.Thread.第三章.pipInputOutput;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class ThreadRead extends Thread {

    private ReadData read;
    private PipedInputStream input;

    public ThreadRead(ReadData read, PipedInputStream input){
        super();
        this.read = read;
        this.input = input;
    }

    @Override
    public void run(){
        read.readMethod(input);
    }
}
