package main.java.GenericsSample;

class GenericsTypeNew<T> {

    private T t;

    public T get(){
        return this.t;
    }

    public void set(T t1){
        this.t=t1;
    }

    public static void main(String args[]){

        GenericsTypeNew<String> type = new GenericsTypeNew<>();
        type.set("DJ"); //valid

        GenericsTypeNew type1 = new GenericsTypeNew(); //raw type
        type1.set("DJ"); //valid
        type1.set(10); //valid and autoboxing support
        System.out.println(type1.get());
    }
}
