package main.java.ArraysExample;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String args[]) {

        int[] arr = {2,4,9,5,1,6};

        for(int i=0; i<arr.length; i++) {

            for(int j=i+1; j<arr.length; j++) {

                if(arr[i]>arr[j]) {
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        /*for(int i=0; i<arr.length; i++)
            System.out.println(arr[i]);*/

        System.out.println(Arrays.toString(arr));
    }
}