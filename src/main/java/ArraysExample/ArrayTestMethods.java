package main.java.ArraysExample;

import java.util.Arrays;

public class ArrayTestMethods {

    public static void main(String args[]) {

        int[] arr = {2, 4, 9, 5, 1, 6};

        System.out.println("Sum of values greater or equal to 5 is: " + Arrays.stream(arr).filter(value -> value >= 5).sum());

        String[] strings = {"DJ", "Shashank"};

        System.out.println(Arrays.toString(strings));

        String[][] strings2D = {{"DJ", "Shashank"}, {"Chacha", "Chachi"}};

        System.out.println(Arrays.toString(strings2D));

        System.out.println(Arrays.deepToString(strings2D));
    }
}
