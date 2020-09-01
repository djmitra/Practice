package main.java.Multithreading;

import java.util.Scanner;

class OddThread implements Runnable {

    Integer max;

    OddThread(int max) {

        this.max = max;
    }

    public void run() {

        try {
            printOddValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void printOddValue() throws InterruptedException {

        synchronized (max) {
            for (int i = 1; i <= max; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + "");
                    max.notify();
                    max.wait();
                }
            }
        }
    }
}

class EvenThread implements Runnable {

    Integer max;

    EvenThread(int max) {

        this.max = max;
    }

    public void run() {

        try {
            printEvenValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void printEvenValue() throws InterruptedException {

        synchronized (max) {
            for (int i = 2; i <= max; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + "");
                    max.notify();
                    max.wait();
                }
            }
        }
    }
}

public class OddEvenThread {

    public static void main(String []args) {

        System.out.print("Please the max number you want to display: ");
        Scanner sc = new Scanner(System.in);
        Integer maxValue = sc.nextInt();
        new Thread(new OddThread(maxValue)).start();
        new Thread(new EvenThread(maxValue)).start();
    }
}