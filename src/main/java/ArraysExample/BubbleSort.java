package main.java.ArraysExample;

public class BubbleSort {

    public static void main(String args[]) {

        int[] arr = {2, 4, 9, 5, 1, 6};

        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++) // Elements at the end are getting sorted
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        
    }
}