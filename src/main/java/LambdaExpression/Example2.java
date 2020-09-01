package main.java.LambdaExpression;

/*
    Lambda Expression with single parameter
 */

interface Incremental {
    int incrementByFive(int i);
}

public class Example2 {

    public static void main(String []args) {

        // Without return type
        Incremental incremental1 = num -> num+5;
        System.out.println(incremental1.incrementByFive(5));

        // With return type
        Incremental incremental2 = (num) -> {return num+5;};
        System.out.println(incremental2.incrementByFive(5));

    }
}
