package main.java.ArraysExample;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String args[]) {

        System.out.println("Print enter the number of elements to be added in array: ");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println("Enter the elements for the array: ");

        int[] arr = new int[num];

        for(int i=0; i<num; i++)
            arr[i] = sc.nextInt();

        for(int i=num-1; i>=0; i--)
            System.out.println(arr[i]);
    }
}
