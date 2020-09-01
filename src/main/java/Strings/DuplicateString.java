package main.java.Strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DuplicateString {

    static void findDuplicateWord(String str) {

        String[] arr = str.split(" ");

        Map<String, Integer> hm = new HashMap<>();

        for(String s:arr) {

            if(hm.get(s) != null)
                hm.put(s, hm.get(s)+1);
            else
                hm.put(s, 1);
        }

        System.out.println(hm);

        Iterator<String> itr = hm.keySet().iterator();

        while(itr.hasNext()) {

            String word = itr.next();
            if(hm.get(word)>1)
                System.out.println("\nThe word '"+word+"' is occurring "+hm.get(word)+" number of times");

            // The following code was wrong as calling itr.hasNext and itr.next multiple times will change the value
            /*int temp = hm.get(itr.next());
            if(temp>1)
                System.out.println("\nThe word "+itr.next()+" is occurring "+temp+" number of times");*/
        }
    }

    static void findDuplicateChar(String str) {

        Map<Character, Integer>  hm = new HashMap<>();

        for(int i=0; i<str.length(); i++) {

            char c = str.charAt(i);

            if(hm.get(c) != null)
                hm.put(c, hm.get(c)+1);
            else
                hm.put(c,1);
        }

        System.out.println(hm);

        Iterator<Character> itr = hm.keySet().iterator();

        while(itr.hasNext()) {

            char c = itr.next();

            if(hm.get(c)>1)
                System.out.println("\nThe char '"+c+"' is occurring "+hm.get(c)+" number of times");
        }
    }

    public static void main(String args[]) {

        findDuplicateWord("I need to to see see a duplicate string string example");

        findDuplicateChar("javaj2ee");
    }
}
