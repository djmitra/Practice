package main.java.Serializaton;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {

    int id;
    String name;
    transient int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

public class FileOutputStreamDemo {

    public static void main(String args[]) throws Exception {

        Student s1 = new Student(101, "DJ", 26);

        FileOutputStream fout = new FileOutputStream("test1.ser");
        ObjectOutputStream out = new ObjectOutputStream(fout);

        // Important Methods of ObjectOutputStream
        out.writeObject(s1);    // writes the specified object to the ObjectOutputStream
        out.flush();            // flushes the current output stream
        out.close();            // closes the current output stream
        System.out.println("Success");
    }
}