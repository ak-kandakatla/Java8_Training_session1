package com.accelya.traing.java8.session1;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by S00268 on 28/02/2018.
 */
public class Streams4 {


    public static void main(String[] argc) {

        Predicate<Person> personPredicate = person -> person.getAge() >= 30;

        List<Person> personAbove30 = PersonDataSource.getPersons().stream()
                .filter(personPredicate)
                .sorted((p1, p2) -> {
                    if (p1.getAge() > p2.getAge()) {
                        return 1;
                    } else if (p1.getAge() < p2.getAge()) {
                        return -1;
                    }
                    return 0;
                })
                .collect(Collectors.toList());

        personAbove30.forEach(System.out::println);

    }
}
