package com.accelya.traing.java8.session1;

import java.util.List;
import java.util.function.Predicate;

/**
 * Created by S00268 on 27/02/2018.
 */
public class Approach6 {


    /**
     * @param argc
     */
    public static void main(String[] argc) {
        List<Person> persons = PersonDataSource.getPersons();
        printOldAgedFemaleWithPredicate(persons, (person) -> person.getGender() == Person.Sex.FEMALE && person.getAge() > 60);
    }

    /**
     * @param roster
     */
    public static void printOldAgedFemaleWithPredicate(List<Person> roster, Predicate<Person> tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.print();
            }
        }
    }
}
