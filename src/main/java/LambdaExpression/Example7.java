package main.java.LambdaExpression;

/*
    Lambda Expression creating thread
 */

import java.util.concurrent.Callable;

public class Example7 {

    public static void main(String[] args) {

        //Runnable has a run method with no return value
        //Thread Example without lambda
        Runnable r1 = new Runnable() {
            public void run() {
                System.out.println("Thread1 is running...");
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();

        //Thread Example without lambda
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                System.out.println("Thread2 is running...");
            }
        });
        t2.start();

        //Thread Example with lambda
        Runnable r = () -> {
            System.out.println("Thread2 is running...");
        };
        Thread t3 = new Thread(r);
        t3.start();

        // Tested callable... Callable has a call method which returns a value
        Callable c = () -> {
            return "Callable called...";
        };
    }
}
