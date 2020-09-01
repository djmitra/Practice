package main.java.EnumDemo;

enum Enums {

    A, B, C(10);

    public int i;

    private Enums() {
        System.out.println(1);
    }

    private Enums(int i) {
        this.i = i;
        System.out.println(i);
    }
}

public class EnumTest {

    public static void main(String[] args) {
        Enums en = Enums.B;
        en.i =5;
        System.out.println(en.i);
        Enums ek = Enums.B;
        ek.i=7;
        System.out.println(en.i);
    }
}
