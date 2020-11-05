package main.java.ArraysExample;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayTestMethods {

    public static void main(String args[]) {

        // Arrays.asList() example

        List<Integer> list = Arrays.asList(1,2,3,4);
        List<Integer> list1 = list.stream().filter(i -> i==0).collect(Collectors.toList());
        System.out.println(list1);

        int[] arr = {2, 4, 9, 5, 1, 6};

        System.out.println("Sum of values greater or equal to 5 is: " +
                Arrays.stream(arr).filter(value -> value >= 5).sum());

        String[] strings = {"DJ", "Shashank"};

        System.out.println(Arrays.toString(strings));

        String[][] strings2D = {{"DJ", "Shashank"}, {"Chacha", "Chachi"}};

        System.out.println(Arrays.toString(strings2D));

        System.out.println(Arrays.deepToString(strings2D));

        //Take input as a String and then convert it into Array

        System.out.println("Enter a number: ");
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();

        int size = str1.length();

        int[] arr1 = new int[size];

        for (int i = 0; i < size; i++)
        {
            arr1[i] = str1.charAt(i) - '0';
        }

        System.out.println(Arrays.toString(arr1));

        // Consider an Integer and then convert it into Array of Digits

        Integer num = 12345;

        int[] newArr = Integer.toString(num).chars().map(c -> c-'0').toArray();

        System.out.println(Arrays.toString(newArr));

        // Q. Why you have put -'0' in the line ???

        // A. str1.charAt(0) isn't 1, it's '1' - the character '1'.
        // That has an integer value of 49, because the Unicode character 49 is the digit 1.
        // It's important to differentiate between the character value and
        // the integer value that it represents as a digit.
        // That's the simplest way to get from '0', '1', '2' etc to the integer representations of those digits.
    }
}
