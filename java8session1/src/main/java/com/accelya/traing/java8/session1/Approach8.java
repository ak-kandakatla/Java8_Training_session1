package com.accelya.traing.java8.session1;

import java.util.List;

/**
 * Created by S00268 on 27/02/2018.
 */
public class Approach8 {


    /**
     * @param argc
     */
    public static void main(String[] argc) {
        List<Person> persons = PersonDataSource.getPersons();
        ElementProcessor.processElement(persons, (person) -> person.getGender() == Person.Sex.FEMALE && person
                        .getAge() > 60,
                person -> person.print(), person -> person.getEmail());
    }


}
