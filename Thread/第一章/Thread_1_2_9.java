package com.fanke.Thread.第一章;

public class Thread_1_2_9  {

    private static String usernameRef;
    private static String passwordRef;

     public static void doPost(String username, String password){
        try{
            usernameRef = username;
            if(username.equals("a")){
                Thread.sleep(5000);
            }
            passwordRef = password;

            System.out.println("username=" + username + "password" + password);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
