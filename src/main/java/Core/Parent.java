package main.java.Core;

public abstract class Parent {

    public abstract void abs();

    public final void nickName() {
        System.out.println("in abstract class nickname()");
    }

    public static void name() {
        System.out.println("in abstract class name()");
    }

    public void firstName() {
        System.out.println("in abstract class firstname()");
    }
}
