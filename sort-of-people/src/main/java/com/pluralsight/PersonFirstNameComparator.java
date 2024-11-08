package com.pluralsight;

import java.util.Comparator;

public class PersonFirstNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getFirstName().compareToIgnoreCase(p2.getFirstName());
    }
}
