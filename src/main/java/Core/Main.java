package main.java.Core;

import main.java.Core2.IA;

public class Main {

    int val = 10;

    public static void main(String[] args) {

        Parent p = new Child();
        p.abs();
        p.name();
        p.firstName();
        // p.surname();
        Child c = new Child();
        c.abs();
        c.name();
        c.firstName();
        c.surname();

        /*Main main = new Main();
        System.out.println(main.val);*/

    }
}
