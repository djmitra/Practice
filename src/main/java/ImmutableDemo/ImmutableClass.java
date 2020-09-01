package main.java.ImmutableDemo;

final public class ImmutableClass {

    final private int i;

    ImmutableClass(int i) {

        this.i=i;
    }

    public int getValue() {

        return this.i;
    }
}
