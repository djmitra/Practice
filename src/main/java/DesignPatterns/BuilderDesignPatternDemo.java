package main.java.DesignPatterns;

/*
    By Default class is private, that is can be accessed only within the package
 */
class Student {

    public int roll_no;
    public String name;

    public int getRoll_no() {
        return roll_no;
    }

    public Student setRoll_no(int roll_no) {
        this.roll_no = roll_no;
        return this;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    /*Student(int roll_no, String name)
    {
        this.roll_no = roll_no;
        this.name = name;
    }*/
}

class BuilderDesignPatternDemo {

    public static void main(String[] args) {

        Student st = new Student().setName("DJ").setRoll_no(111);
        System.out.println(st.getName());
    }
}