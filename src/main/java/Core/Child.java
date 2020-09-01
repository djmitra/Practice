package main.java.Core;

public class Child extends Parent{

    @Override
    public void abs() {
        System.out.println("implemented abs in child class");
    }

    // We cannot override final method.
    /*public final void nickName() {
        System.out.println("in abstract class nickname()");
    }*/

    /* We cannot override static method.
    Child class method should also be static in order to have same name.
    Static methods will belong to the class itself. */
    public static void name() {
        System.out.println("in child class name()");
    }

    public void firstName() {
        System.out.println("in child class firstname()");
    }

    public void surname() {
        System.out.println("in child class surname()");
    }
}
