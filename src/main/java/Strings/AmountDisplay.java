package main.java.Strings;

public class AmountDisplay {

    public static void main(String args[]) {

        String s = "3.0";
        Double d = new Double(s);
        System.out.println("$" + String.format("%.2f", d));
    }
}
