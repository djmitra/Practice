package main.java.CustomMarkerInterface;

interface Marker{
}

class MyException extends Exception {
    public MyException(String s){
        super(s);
    }
}

class A  {
    void m1() throws MyException{
        if((this instanceof Marker)){
            System.out.println("Successful");
        }
        else {
            throw new MyException("Must implement interface Marker");
        }
    }
}

// if this class will not implement Marker, throw exception
public class CustomMarkerInterfaceExample  extends A implements Marker {

    public static void main(String[] args)  {
        CustomMarkerInterfaceExample a = new CustomMarkerInterfaceExample();
        try {
            a.m1();
        } catch (MyException e) {

            System.out.println(e);
        }
    }
}
