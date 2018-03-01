package com.accelya.traing.java8.session1;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by S00268 on 28/02/2018.
 */
public class Streams5 {


    public static void main(String[] argc) {

        Predicate<Person> personPredicate = person -> person.getAge() >= 40;

        Map<Integer, List<Person>> personByAge = PersonDataSource.getPersons().stream().collect(Collectors
                .groupingBy(o -> o.getAge
                        ()));

        personByAge.forEach((age, p) -> System.out.format("age %s: %s\n", age, p));


    }
}
