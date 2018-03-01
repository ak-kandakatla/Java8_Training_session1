package com.accelya.traing.java8.session1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by S00268 on 27/02/2018.
 */
public class PersonDataSource {

    public static List<Person> getPersons() {

        return Arrays.asList(new Person("Peter ", 28, Person.Sex.MALE, "peter@sample.com"),
                new Person("John Doe ", 32, Person.Sex.MALE, "john.deo@sample.com"),
                new Person("Mary ", 78, Person.Sex.FEMALE, "mary.james@sample.com"),
                new Person("Adam ", 40, Person.Sex.MALE, "adam.samuel@sample.com"),
                new Person("Linda ", 12, Person.Sex.FEMALE, "linda.fred@sample.com"),
                new Person("Mark Williams", 34, Person.Sex.FEMALE, "taylor.woody@sample.com"),
                new Person("Taylor", 34, Person.Sex.FEMALE, "taylor.woody@sample.com"));
    }


    public static Stream getPersonStream() {
        return getPersons().stream();
    }

    public static Stream getPersonStreamUsingStreamOf() {
        return Stream.of(new Person("Peter ", 28, Person.Sex.MALE, "peter@sample.com"),
                new Person("John Doe ", 32, Person.Sex.MALE, "john.deo@sample.com"),
                new Person("Adam ", 40, Person.Sex.MALE, "adam.samuel@sample.com"),
                new Person("Linda ", 12, Person.Sex.FEMALE, "linda.fred@sample.com"),
                new Person("Mary ", 78, Person.Sex.FEMALE, "mary.james@sample.com"),
                new Person("Taylor", 34, Person.Sex.FEMALE, "taylor.woody@sample.com"));
}
}
