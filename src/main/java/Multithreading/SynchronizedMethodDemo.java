package main.java.Multithreading;

class Account {

    double amnt = 10000.00;

    synchronized public Double withdraw(Double wamt) {
        System.out.println("Withdraw process starts");
        System.out.println("Before withdraw: "+amnt);
        if(amnt < wamt) {
            System.out.println("Insufficient balance");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        amnt = amnt - wamt;
        System.out.println("After withdraw: "+amnt);
        return wamt;
    }

    synchronized public void deposit(Double damt) {
        System.out.println("Deposit process starts");
        System.out.println("Before deposit: "+amnt);
        amnt = amnt + damt;
        System.out.println("After deposit: "+amnt);
        notify();
    }
}

public class SynchronizedMethodDemo {

    public static void main(String []args) {

        final Account acc = new Account();

        // Before Java 8 i.e. Anonymous Inner Class
        new Thread() {
            public void run() {
                acc.withdraw(15000.00);
            }
        }.start();

        // Using Java 8 i.e. Lambda Expressions
        new Thread(() -> {
            acc.deposit(10000.00);
        }).start();
    }
}
