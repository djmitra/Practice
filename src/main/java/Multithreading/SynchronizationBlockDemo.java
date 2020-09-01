package main.java.Multithreading;

class BankAccount {

    double amnt = 10000.00;

    public Double withdraw(Double wamt) {

        System.out.println("Withdraw process starts");
        System.out.println("Before withdraw: "+amnt);

        synchronized (this) {
            if(amnt < wamt)
                System.out.println("Insufficient balance");
            else
                amnt = amnt - wamt;
        }

        System.out.println("After withdraw: "+amnt);
        return wamt;
    }

    public void deposit(Double damt) {

        System.out.println("Deposit process starts");
        System.out.println("Before deposit: "+amnt);

        synchronized (this) {
            amnt = amnt + damt;
        }

        System.out.println("After deposit: "+amnt);
    }
}

public class SynchronizationBlockDemo {

    public static void main(String []args) {

        BankAccount acc = new BankAccount();
        new Thread() {
            public void run() {
                acc.withdraw(15000.00);
            }
        }.start();
        new Thread() {
            public void run() {
                acc.deposit(10000.00);
            }
        }.start();
    }
}
