package main.java.HackerRank;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
public class ArrayPairCount {

    static int sockMerchant(int n, int[] arr) {

        int pairs = 0;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(arr[i]>arr[j]) {
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(arr[i]==arr[j]) {
                    pairs++;
                    i++;
                    break;
                }
            }
        }

        return pairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[] arr = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        int result = sockMerchant(arr.length, arr);

        System.out.println(result);

    }
}
