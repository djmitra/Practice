package main.java.ComparableDemo;

class Student implements Comparable<Student> {

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

    @Override
    public int compareTo(Student o) {

        /*if (this.roll_no > o.roll_no)
            return 1;
        else if (this.roll_no < o.roll_no)
            return -1;
        else
            return 0;*/

        return this.roll_no - o.roll_no;
    }
}
