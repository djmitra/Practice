package main.java.Multithreading;

class MyThread extends Thread {

    MyThread() {
    }

    MyThread(Runnable r) {
        super(r);
    }

    public void run() {
        System.out.println("running...");
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("thread is running...");
    }
}

public class ThreadExecution {
    public static void main(String args[]) {
        new MyThread().start();
        new MyThread(new MyRunnable()).start();
    }
}


