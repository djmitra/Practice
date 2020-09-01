package main.java.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

    public static void main(String args[]) {

        System.out.println("Please enter the first string: ");

        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();

        System.out.println("Please enter the second string: ");

        String str2 = scanner.nextLine();

        anagramCheck(str1, str2);
    }

    private static void anagramCheck(String str1, String str2) {

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        if (Arrays.equals(charArray1, charArray2))
            System.out.println("The Strings are anagrams");
        else
            System.out.println("The Strings are not anagrams");
    }
}
