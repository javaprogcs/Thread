package com.fanke.Thread.第二章;

public class ObjectService {

    public void serviceMethodA() {
        try{
            synchronized (this) {
                System.out.println("A begin time=" + System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("A end end=" + System.currentTimeMillis());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void serviceMethodB(){
        synchronized (this) {
            System.out.println("B begin time=" + System.currentTimeMillis());
            System.out.println("B end end=" + System.currentTimeMillis());
        }
    }
}

class ObjectThread extends  Thread{
    private ObjectService objectService;

    public ObjectThread(ObjectService objectService){
        super();
        this.objectService = objectService;
    }

    @Override
    public void run(){
        super.run();
        objectService.serviceMethodA();
    }
}


class ObjectThread1 extends  Thread{
    private ObjectService objectService;

    public ObjectThread1(ObjectService objectService){
        super();
        this.objectService = objectService;
    }

    @Override
    public void run(){
        super.run();
        objectService.serviceMethodA();
    }

    public static void main(String[] args) {
        ObjectService service = new ObjectService();

        ObjectThread objectThread = new ObjectThread(service);
        objectThread.setName("a");
        objectThread.start();

        ObjectThread1 objectThread1 = new ObjectThread1(service);
        objectThread1.setName("a");
        objectThread1.start();
    }
}

