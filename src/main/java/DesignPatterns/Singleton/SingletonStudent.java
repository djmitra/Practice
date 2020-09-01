package main.java.DesignPatterns.Singleton;

class SingletonStudent {

    private static SingletonStudent single_instance = null;

    int roll_no;
    String name;

    private SingletonStudent(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }

    // Making method synchronized can make it thread safe but performance will be much slow
    public static SingletonStudent getInstance(int i, String s) {

        // Not thread safe
        /*if (single_instance == null)
            single_instance = new SingletonStudent(i, s);*/

        // Thread safe made by Double Checked Locking which is faster than making the method synchronized
        if (single_instance == null) {
            synchronized (SingletonStudent.class) {
                if (single_instance == null)
                    single_instance = new SingletonStudent(i, s);
            }
        }
        return single_instance;
    }

    public void displayDetails() {

        System.out.println("Rollno is " + this.roll_no + " & name is " + name);
    }
}
