package main.java.Multithreading;

class MyThread extends Thread{

    MyThread() {};
    MyThread(Runnable r) {super(r);}

    public void run(){
        System.out.println("running...");
    }
    /*public static void main(String args[]){
        MyThread t1=new MyThread();
        t1.start();
        t1.start();
    }*/
}

class MyRunnable implements Runnable{
    public void run(){
        System.out.println("thread is running...");
    }

    /*public static void main(String args[]){
        Multi3 m1=new Multi3();
        Thread t1 =new Thread(m1);
        t1.start();
    }*/
}

    public class ThreadExecution {
        public static void main(String args[]){
            new MyThread().start();
            new MyThread(new MyRunnable()).start();
        }
}


