package main.java.ExceptionHandling;

public class Test1 {

    public static void main(String[] args) {

        Test1 test1 = new Test1();
        System.out.println(test1.test());
    }

    public int test() {
        try {
            return 1;
        }
        catch(Exception ex) {
            return 2;
        }
        finally {
            return 3;
        }
    }
}
