package main.java.ConcurrentCollectionDemo;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashSetDemo {

    public static void main(String[] args) throws Exception {

        ConcurrentHashMap certificationCosts = new ConcurrentHashMap<>();
        certificationCosts.put("OCAJP", 246);
        certificationCosts.put("OCPJP", 246);
        certificationCosts.put("Spring Core", 200);
        certificationCosts.put("Spring Web", 200);
        certificationCosts.put("OCMJEA", 300);

        Set concurrentSet = certificationCosts.keySet();

        System.out.println("before adding element into concurrent set: " + concurrentSet);
        // concurrentSet.add("OCEJWCD"); // will throw UnsupportedOperationExcetpion
        System.out.println("after adding element into concurrent set: " + concurrentSet);

        // creating concurrent hash set in Java 8 using newKeySet() method
        Set concurrentHashSet = certificationCosts.newKeySet();

        concurrentHashSet.add("OCEJWCD");
        concurrentHashSet.contains("OCEJWCD");
        concurrentHashSet.remove("OCEJWCD");
        System.out.println("after adding element into concurrent HashSet: " + concurrentSet);

        // you can also use keySet(defaultValue) method to add element into Set
        concurrentSet = certificationCosts.keySet(123);
        concurrentSet.add("Spring enterprise"); // value will be 123 but no error
        System.out.println("after adding element into concurrent HashSet: " + concurrentSet);

    }
}
