package com.accelya.traing.java8.session1;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by S00268 on 27/02/2018.
 */
public class Approach7_1 {


    /**
     * @param argc
     */
    public static void main(String[] argc) {
        List<Person> persons = PersonDataSource.getPersons();
        printOldAgedFemale(persons, (person) -> person.getGender() == Person.Sex.FEMALE && person.getAge() > 60,
                person -> person.print(), p-> p.getEmail());
    }

    /**
     * @param roster
     */
    public static void printOldAgedFemale(List<Person> roster, Predicate<Person> tester, Consumer<Person> block,
                                          Function<Person, String> mapper) {
        for (Person p : roster) {
            if (tester.test(p)) {
                String data = mapper.apply(p);
                System.out.println(data);
                block.accept(p);
            }
        }
    }
}
