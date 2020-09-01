package main.java.DesignPatterns.Singleton;

class SingletonDemo {

    public static void main(String args[]) {

        // Without Multi Threading
        /*SingletonStudent student1 = SingletonStudent.getInstance(1, "DJ");
        student1.displayDetails();
        SingletonStudent student2 = SingletonStudent.getInstance(2, "Adi");
        student1.displayDetails();
        student2.displayDetails();*/

        // With Multithreading
        new Thread(() -> {
            SingletonStudent student1 = SingletonStudent.getInstance(1, "DJ");
            student1.displayDetails();
        }).start();

        new Thread(() -> {
            SingletonStudent student1 = SingletonStudent.getInstance(2, "Adi");
            student1.displayDetails();
        }).start();

        SingletonEnum obj1 = SingletonEnum.INSTANCE;
        obj1.i = 5;
        obj1.show();

        SingletonEnum obj2 = SingletonEnum.INSTANCE;
        obj2.i=7;

        obj1.show();
    }
}

enum SingletonEnum {

    INSTANCE;

    int i;

    public void show() {
        System.out.println(i);
    }
}
