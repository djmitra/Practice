package main.java.ComparatorDemo;

import java.util.Comparator;

class Student {

    public int roll_no;
    public String name;

    Student(int roll_no, String name)
    {
        this.roll_no = roll_no;
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                '}';
    }
}

// When we can't touch the source file, we use Comparator

class Sortbyroll implements Comparator<Student> {
    // Used for sorting in ascending order of roll number
    public int compare(Student a, Student b) {
        return a.roll_no - b.roll_no;
    }
}

class Sortbyname implements Comparator<Student> {
    // Used for sorting in ascending order of student name
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);
    }
}
