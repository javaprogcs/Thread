package com.fanke.Thread.第六章.singleton_7_1;

import java.io.*;

public class SaveAndRead {

    public static void main(String[] args) {
        try{
            MyObject myObject = MyObject.getInstance();
            System.out.println("序列化-myObject=" + myObject.hashCode() + "user-info=" + myObject.userInfo.hashCode());
             FileOutputStream fileOutputStream = new FileOutputStream(new File("myObject-File.txt"));
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(myObject);
            outputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
             FileInputStream fileInputStream = new FileInputStream(new File("myObjectFile.txt"));
             ObjectInputStream objectOutputStream = new ObjectInputStream(fileInputStream);
             MyObject myObject = (MyObject) objectOutputStream.readObject();
             objectOutputStream.close();
             fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
