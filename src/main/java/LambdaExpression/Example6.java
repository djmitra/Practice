package main.java.LambdaExpression;

/*
    Lambda Expression with comparator
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class  Product {

    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
}

public class Example6 {

    public static void main(String []args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product(1, "HP", 300f));
        list.add(new Product(2, "Acer", 250f));
        list.add(new Product(3, "Dell", 3500f));

        System.out.println("Sorting by comaprator on basis of name:");

        //Depricated way to use compare

        //Reports Comparators defined as lambda expressions which could be expressed using methods like Comparator.comparing().
        //Some comparators like (person1, person2) -> person1.getName().compareTo(person2.getName()) could be simplified like this: Comparator.comparing(Person::getName).
        //Also suggests to replace chain comparisons with Comparator.thenComparing(), e.g. int res = o1.first.compareTo(o2.first); if(res == 0) res = o1.second.compareTo(o2.second); if(res == 0) res = o1.third - o2.third; return res; will be replaced with objs.sort(Comparator.comparing((Obj o) -> o.first).thenComparing(o -> o.second).thenComparingInt(o -> o.third));

        /*Collections.sort(list, (p1,p2) -> {
            return p1.name.compareTo(p2.name);
        });*/

        //To be tested along with reverseOrder()
        //https://www.geeksforgeeks.org/collections-reverseorder-java-examples/

        //Collections.sort(list, Comparator.naturalOrder());

        Collections.sort(list, Comparator.comparing(Product::getName));

        list.forEach(value -> System.out.println(value.getName()));
    }
}
