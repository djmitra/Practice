package main.java.Core2;

public class Main {

    public static void main(String []args) {

        IA ia = new IAIBImpl();
        ia.print();
        IA.display();

        //ia.display();
        //ia.show();

        IB ib = new IAIBImpl();
        ib.print();
        IB.display();
        ib.show();
    }
}