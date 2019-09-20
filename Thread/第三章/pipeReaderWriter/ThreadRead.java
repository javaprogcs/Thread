package com.fanke.Thread.第三章.pipeReaderWriter;

import java.io.PipedReader;
import java.io.PipedWriter;

public class ThreadRead extends Thread {

    private ReadData readData;
    private PipedReader input;

    public ThreadRead(ReadData readData, PipedReader input){
        super();
        this.readData = readData;
        this.input = input;
    }

    @Override
    public void run(){
        readData.readMethod(input);
    }
}
