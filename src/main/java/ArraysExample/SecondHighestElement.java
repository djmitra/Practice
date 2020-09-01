package main.java.ArraysExample;

import java.util.Arrays;

public class SecondHighestElement {

    public static void main(String args[]) {

        int[] arr = {2,4,9,5,1,6};

        Arrays.sort(arr);

        System.out.println("The second highest element is: " + arr[arr.length-2]);
    }
}
