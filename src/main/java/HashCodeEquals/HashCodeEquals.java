package main.java.HashCodeEquals;

import java.util.HashMap;
import java.util.Map;

public class HashCodeEquals {

    public static void main(String []args) {

        // Equals Method Override
        Address address1 = new Address("KB Lane", "Kol", 98007);
        Student s1 = new Student("123", "Chacha");
        s1.setAddress(address1);

        Address address2 = new Address("KB Lane", "Kol", 98007);
        Student s2 = new Student("123", "Chacha");
        s2.setAddress(address2);

        System.out.println(s1.equals(s2));

        // HashCode Method Override
        Address address3 = new Address("KB Lane", "Kol", 98007);
        Student s3 = new Student("123", "Chacha");
        s3.setAddress(address3);
        ReportCard reportCard3 = new ReportCard(300, 75);

        Address address4 = new Address("KB Lane", "Kol", 98007);
        Student s4 = new Student("123", "Chacha");
        s4.setAddress(address4);
        ReportCard reportCard4 = new ReportCard(350, 87);

        Map<Student, ReportCard> map = new HashMap<>();
        map.put(s3, reportCard3);
        map.put(s4, reportCard4);

        System.out.println(s3.equals(s4));

        System.out.println(map.get(s3).toString());
        System.out.println(map.get(s4).toString());

    }
}
