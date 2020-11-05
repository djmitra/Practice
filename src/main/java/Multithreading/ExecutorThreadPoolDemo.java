package main.java.Multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processor implements Runnable {

    private int id;

    public Processor(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Starting: " + id);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Stopping: " + id);
    }
}

public class ExecutorThreadPoolDemo {

    public static void main(String []args) {

        // Using Executor Interface to create child class reference
        // Will not complete the program execution as it has no shutdown method
        /*Executor executor = Executors.newFixedThreadPool(2);

        // Using execute method, has no return value
        for(int i=0; i<5; i++) {
            executor.execute(new Processor(i));
        }*/

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for(int i=0; i<5; i++) {
            executorService.execute(new Processor(i));
        }

        // Makes sure the program exits by shutting down the executor
        // This is not impact the created Threads to be executed
        executorService.shutdown();

        System.out.println("All Tasks Submitted");

        // Extra Method
        try {
            executorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
