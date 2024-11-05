package com.pluralsight;

import java.util.function.Consumer;

public class ManEater implements Consumer<Person> {

    @Override
    public void accept(Person person) {
        System.out.println(person);
    }
}
