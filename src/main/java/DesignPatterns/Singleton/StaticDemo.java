package main.java.DesignPatterns.Singleton;

public class StaticDemo {

    static class StaticStudent {

        int roll_no;
        String name;

        public StaticStudent(int roll_no, String name)
        {
            this.roll_no = roll_no;
            this.name = name;
        }

        public void displayDetails() {

            System.out.println("Rollno is "+this.roll_no+" & name is "+name);
        }
    }

    public static void main(String args[]) {

        StaticStudent student1 = new StaticStudent(1, "DJ");
        student1.displayDetails();

        StaticStudent student2 = new StaticStudent(2, "Adi");
        student2.displayDetails();
    }
}
