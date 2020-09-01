package main.java.Core;

public class ArraysInJava {
    static void methodOne(Integer[] a) {

        /*Integer[] b = new Integer[5];
        a = b;*/
        a[0]=5;
        System.out.println(a.length);
        //System.out.print(b.length);
    }

    public static void main(String[] args) {

        Integer[] a = new Integer[10];
        a[0]=7;
        System.out.println(a[0]);
        methodOne(a);
        System.out.println(a.length);
        System.out.println(a[0]);
    }

    /*static void methodOne(Integer a) {

        a=5;
    }

    public static void main(String[] args) {

        Integer a = 7;
        //a[0]=7;
        System.out.println(a);
        methodOne(a);
        System.out.println(a);
    }*/
}
