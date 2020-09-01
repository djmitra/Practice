package main.java.LambdaExpression;

/**
    Lambda Expression with no parameter
*/

interface Drawable {
    void draw(int width);
}

public class Example1 {

    public static void main(String[] args) {

        Drawable drawable = (width) -> {
            System.out.println("Drawing: " + width);
        };
        drawable.draw(10);
    }
}
