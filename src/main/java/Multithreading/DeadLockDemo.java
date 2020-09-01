package main.java.Multithreading;

public class DeadLockDemo extends Thread {

    @Override
    public void run() {
        for (int i=0; i<=10; i++) {
            System.out.println(i + ".run: " + Thread.currentThread().getName() + Thread.currentThread().isDaemon());
            // To test deadlock situation
            // mt.join();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String []a) throws InterruptedException {

        DeadLockDemo obj = new DeadLockDemo();
        obj.setName("DJ");
        // To change thread to Low Priority Thread
        obj.setDaemon(true);
        obj.start();
        //obj.join();
        for (int i=0; i<=10; i++) {
            Thread.sleep(500);
            System.out.println(i + ".main: " + Thread.currentThread().getName() + Thread.currentThread().isDaemon());
        }
    }
}
