package main.java.LambdaExpression;

/*
    Lambda Expression with multiple statements
 */

interface Sayable {
    public String say(String message);
}

public class Example5 {

    public static void main(String []args) {

        Sayable person = message -> {
            String s1 = "Hello ";
            String s2 = s1 + message;
            return s2;
        };

        System.out.println(person.say("Chacha"));
    }
}
