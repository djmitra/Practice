package main.java.Strings;

public class FinalvsImmutable {

    public static void main(String args[]) {

        // Immutable
        // We can't change value, but can change the reference
        String im = new String("Hello");
        System.out.println(im);

        im = "Hey";
        System.out.println(im);

        // Final
        // We can't change the reference, but we can update the internal values
        final StringBuffer fn = new StringBuffer("Hi");
        fn.append(" DJ");
        System.out.println(fn);

        // Can't reassign, will throw compile error
        // fn = new StringBuffer("Yo");
    }
}
