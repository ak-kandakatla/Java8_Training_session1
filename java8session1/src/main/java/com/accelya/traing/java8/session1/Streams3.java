package com.accelya.traing.java8.session1;

import java.util.function.Predicate;

/**
 * Created by S00268 on 28/02/2018.
 */
public class Streams3 {


    public static void main(String[] argc) {

        Predicate<Person> personPredicate = person -> person.getAge() >= 40;

        PersonDataSource.getPersons().stream()
                .filter(personPredicate)
                .map(person -> person.getName())
                .sorted()
                .forEach(System.out::println);


    }
}
