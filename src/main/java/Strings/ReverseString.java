package main.java.Strings;

import java.util.Scanner;

public class ReverseString {

    public static void main(String args[]) {

        System.out.println("Please provide a string to be reversed: ");

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        System.out.println("The string entered is: " + str);

        // Using logic
        reverseString(str);

        // Using Java Api
        reverseUsingStringBuffer(str);
    }

    private static void reverseString(String str) {

        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("The reverse of the string is: " + str);
    }

    private static void reverseUsingStringBuffer(String str) {

        StringBuffer bf = new StringBuffer(str);

        System.out.println(bf.reverse());

        String rev = bf.reverse().toString();

        System.out.println(rev);
    }
}