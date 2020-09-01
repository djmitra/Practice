package main.java.ComparatorDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {

    public static void main(String args[]) {

        List<Student> list = new ArrayList<>();
        list.add(new Student(121, "Ping Pong"));
        list.add(new Student(131, "Bon Bon"));
        list.add(new Student(111, "Ding Dong"));
        list.add(new Student(141, "Ding Dong"));

        System.out.println("Default List");

        for(Student st : list)
            System.out.println(st);

        // When we can't touch the source file, we use Comparator Class

        System.out.println("List sorted by roll number by creating a separate class");

        Collections.sort(list, new Sortbyroll());

        for(Student st : list)
            System.out.println(st);

        System.out.println("List sorted by student name by creating a separate class and using compareTo method");

        Collections.sort(list, new Sortbyname());

        for(Student st : list)
            System.out.println(st);

        System.out.println("List sorted by roll number by using comparing and reversed methods of Comparator class");

        list.sort(Comparator.comparing(Student::getRoll_no).reversed());

        for(Student st : list)
            System.out.println(st);

        System.out.println("List sorted by student name by using comparing and thenComparing methods of Comparator class");

        Collections.sort(list, Comparator.comparing(Student::getName).thenComparing(Student::getRoll_no));

        for(Student st : list)
            System.out.println(st);
    }
}
