package main.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionsExample {

    public static void main(String []args) {

        final Map map = new HashMap();
        map.put(1,"DJ");
        map.put("sdf","asd");
        System.out.println(map.get(1));
        System.out.println(map.get("sdf"));

        List arrayList = new ArrayList<String>();
        arrayList.add("asd");
        arrayList.add(1);
        arrayList.add(true);
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));

        List<String> arrayList1 = new ArrayList<>();
        arrayList1.add("asd");
        //arrayList1.add(1);
        //arrayList1.add(true);

        Object[] arr = new Object[3];
        arr[0] = 123;
        arr[1] = "asd";
        arr[2] = true;

        Object[] arr1 = new String[3];
        //arr1[0] = 123; // Will Throw java.lang.ArrayStoreException
        arr1[1] = "asd";
        //arr1[2] = true;
    }
}
