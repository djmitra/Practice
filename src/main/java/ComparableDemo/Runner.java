package main.java.ComparableDemo;

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

        System.out.println("Default List");

        for(Student st : list)
            System.out.println(st);

        System.out.println("Sorted List as per Comparable class implemented and compareTo overriden i.e. natural sorting");

        Collections.sort(list);

        for(Student st : list)
            System.out.println(st);

        System.out.println("Sorted List using Comparator class i.e. user required sorting");

        list.sort(Comparator.comparing(Student::getName));

        for(Student st : list)
            System.out.println(st);

    }
}
