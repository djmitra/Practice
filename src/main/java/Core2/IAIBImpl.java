package main.java.Core2;

public class IAIBImpl implements IA, IB {

    // Cannot assign value to s
    /*IAIBImpl() {
        s = "Hey";
    }*/

    private int a = 5;

    // Constructor can't be final
    /*final IAIBImpl() {
        a = 5;
        System.out.println("This is a final constuctor with value as " + a);
    }*/

    @Override
    public void show() {

        System.out.println("You are inside Impl class method, " + s);
    }
}