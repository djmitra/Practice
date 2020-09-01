package main.java.Core2;

/**
 * Interface extends other Interface
 */
public interface IB extends IA {

    // By Default it is public static final
    String s = "Hello";

    // Override the print method in IA
    default void print() {
        System.out.println("Default method in Interface IB");
    }

    // Static Method belongs to the class
    static void display(){
        System.out.println("Static methods in interface IB");
    }

    void show();
}