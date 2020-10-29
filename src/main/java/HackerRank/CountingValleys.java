package main.java.HackerRank;

// https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
public class CountingValleys {

    /*
    Sample Input
    8
    UDDDUDUU
    12
    DDUUDDUDUUUD

    As per my understanding, not working in actual question
    */

    public static void main(String[] args) {

        int steps = 12;
        String path = "DDUUDDUDUUUD";

        int level = 0;
        int valleys = 0;
        int valleysCrossed=0;

        // char[] pathChar = path.toCharArray();

        for(char c : path.toCharArray()){
            if(c == 'U') level++;
            if(c == 'D') level--;

            if(level == 0 && c =='U') {
                valleys++;
            }
        }

        System.out.println(valleys);
    }
}
