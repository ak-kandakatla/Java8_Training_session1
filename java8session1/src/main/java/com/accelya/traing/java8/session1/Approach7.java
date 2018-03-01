package com.accelya.traing.java8.session1;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by S00268 on 27/02/2018.
 */
public class Approach7 {


    /**
     * @param argc
     */
    public static void main(String[] argc) {
        List<Person> persons = PersonDataSource.getPersons();
        printOldAgedFemale(persons, (person) -> person.getGender() == Person.Sex.FEMALE && person.getAge() > 60,
                person -> {
                    System.out.println(" Hello");
                    System.out.println(person);
                });
    }

    /**
     * @param roster
     */
    public static void printOldAgedFemale(List<Person> roster, Predicate<Person> tester, Consumer<Person> block) {
        for (Person p : roster) {
            if (tester.test(p)) {
                block.accept(p);
            }
        }
    }
}
