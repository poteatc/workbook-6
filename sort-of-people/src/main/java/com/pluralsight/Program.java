package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Person> myFamily = new ArrayList<Person>();
        myFamily.add( new Person("Dana", "Wyatt", 63) );
        myFamily.add( new Person("Zachary", "Westly", 31) );
        myFamily.add( new Person("Elisha", "Aslan", 14) );
        myFamily.add( new Person("Ian", "Auston", 16) );
        myFamily.add( new Person("Zephaniah", "Hughes", 9) );
        myFamily.add( new Person("Ezra", "Aiden", 17) );

        System.out.println("--Unsorted--");
        printList(myFamily);

        Collections.sort(myFamily);
        System.out.println("--Sorted by Person Comparable overridden compareTo method with ages--");
        printList(myFamily);

        Collections.sort(myFamily, new PersonLastNameComparator());
        System.out.println("--Sorted by PersonLastNameComparator class overriding the compare method from Comparator interface with last names--");
        printList(myFamily);

        Collections.sort(myFamily, new PersonLastNameComparator());
        System.out.println("--Sorted by PersonFirstNameComparator class overriding the compare method from Comparator interface with first names--");
        printList(myFamily);
    }

    private static void printList(List<Person> people) {
        for (Person p : people) {
            System.out.println(p);
        }
        System.out.println();
    }
}
