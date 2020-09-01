package main.java.Core2;

public interface IA {

    // Default Method in Interface
    default void print() {
        System.out.println("Default method in Interface IA");
    }

    // Static Method in Interface
    static void display(){
        System.out.println("Static methods in interface IA");
    }
}