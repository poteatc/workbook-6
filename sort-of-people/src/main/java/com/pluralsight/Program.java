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
        printList(myFamily);
        Collections.sort(myFamily);
        System.out.println("--Sorted--");
        printList(myFamily);
    }

    private static void printList(List<Person> people) {
        for (Person p : people) {
            System.out.println(p);
        }
    }
}
