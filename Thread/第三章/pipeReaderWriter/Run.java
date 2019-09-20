package com.fanke.Thread.第三章.pipeReaderWriter;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class Run {
    public static void main(String[] args) {
        try{
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();

            PipedReader inputStram = new PipedReader();
            PipedWriter pipedWriter = new PipedWriter();

            inputStram.connect(pipedWriter);
            //pipedWriter.connect(inputStram);

            ThreadRead threadRead = new ThreadRead(readData, inputStram);
            threadRead.start();

            Thread.sleep(2000);

            ThreadWrite threadWrite = new ThreadWrite(writeData, pipedWriter);
            threadWrite.start();
        }catch (IOException e){
            e.printStackTrace();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
