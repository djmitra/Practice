package main.java.LambdaExpression;

/*
    Lambda Expression with multiple parameter
 */

interface StringConcat {
    public String concat(String s1, String s2);
}

public class Example3 {

    public static void main(String []args) {

        StringConcat s = (s1, s2) -> s1 + s2;
        System.out.println(s.concat("Hello ", "Chacha"));
    }
}
