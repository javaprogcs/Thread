package com.fanke.Thread.第三章.pipeReaderWriter;

import java.io.IOException;
import java.io.PipedWriter;

public class WriteData {

    public void writeMethod(PipedWriter out){
        try{
            System.out.println("write：");
            for (int i = 0; i < 300; i++) {
                String outData = " " + (i + 1);
                out.write(outData);
                System.out.println(outData);
                System.out.println();
                out.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
