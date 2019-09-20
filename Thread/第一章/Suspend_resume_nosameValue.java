package com.fanke.Thread.第一章;

public class Suspend_resume_nosameValue {

    private  String username = "1";
    private  String password = "11";

    public void serValue(String u, String p){
        this.username = u;
        if(Thread.currentThread().getName().equals("a")) {
            System.out.println("停止a线程！ ");
            Thread.currentThread().suspend();
        }
        this.password = p;
    }

    public void printUsernamePassword() {
        System.out.println(username + "" + password);
    }
    public static void main(String[] args) throws InterruptedException{
        final Suspend_resume_nosameValue nosameValue = new Suspend_resume_nosameValue();

        Thread thread = new Thread() {
            public void run(){
                nosameValue.serValue("a","aa");
            };
        };
        thread.setName("a");
        thread.start();

        Thread.sleep(500);

        Thread thread1 = new Thread() {
            public void run(){
                nosameValue.printUsernamePassword();
            }
        };
        thread1.start();
    }

}
