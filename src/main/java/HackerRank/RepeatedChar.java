package main.java.HackerRank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// As per my understanding, Used StringBuilder and also unable to handle long input scenarios
public class RepeatedChar {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        StringBuilder sb = new StringBuilder(s);
        while(Long.valueOf(sb.length()) < n)
        {
            sb.append(s);
        }
        String ss = sb.toString();
        long count = 0;
        for(long i=0; i<n; i++)
        {
            if(ss.charAt((int)i) == 'a')
                count++;
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

