package main.java.Strings;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String args[]) {

        System.out.println("Please provide a string to be reversed: ");

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        System.out.println("The string entered is: "+str);

        pallindromeCheck(str);
    }

    private static void pallindromeCheck(String str) {

        StringBuffer bf = new StringBuffer(str);

        String rev = bf.reverse().toString();

        if (str.equalsIgnoreCase(rev))
            System.out.println("It is a palindrome");
        else
            System.out.println("It is not a palindrome");
    }
}
