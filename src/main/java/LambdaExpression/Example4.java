package main.java.LambdaExpression;

import java.util.ArrayList;
import java.util.List;

/*
    Lambda Expression using stream, forEach and filter
 */

public class Example4 {

    public static void main(String []args) {

        List<String> list = new ArrayList<>();
        list.add("Chacha");
        list.add("Chachi");
        list.add("Laal");
        list.add("Laale");

        list.forEach(value -> System.out.println(value));

        String s = list.stream()
                .filter(value -> value.equalsIgnoreCase("chachi"))
                .findFirst()
                .orElse(null);

        System.out.println("After applying filter: " + s);
    }
}
