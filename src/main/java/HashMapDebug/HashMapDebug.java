package main.java.HashMapDebug;

import java.util.HashMap;
import java.util.Map;

public class HashMapDebug {

    public static void main(String []args) {

        String s1 = "Ea";
        String s2 = "FB";
        System.out.println("Ea hashcode: " + s1.hashCode());
        System.out.println("FB hashcode: " + s2.hashCode());

        Map<String, Integer> map = new HashMap<>();
        map.put(s1, 1);
        map.put(s2, 1);
        map.put(s2, 2);
        map.put(null, 3);
    }
}