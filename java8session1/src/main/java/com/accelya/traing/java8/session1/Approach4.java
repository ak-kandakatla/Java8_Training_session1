package com.accelya.traing.java8.session1;

import java.util.List;

/**
 * Created by S00268 on 27/02/2018.
 */
public class Approach4 {


    /**
     * @param argc
     */
    public static void main(String[] argc) {
        List<Person> persons = PersonDataSource.getPersons();
        printOldAgedFemale(persons, new PersonTester() {
            @Override
            public boolean test(Person p) {
                return p.getGender() == Person.Sex.FEMALE && p.getAge() > 60;
            }
        });

        printOldAgedFemale(persons, new PersonTester() {
            @Override
            public boolean test(Person p) {
                return p.getGender() == Person.Sex.MALE && p.getAge() > 60;
            }
        });
    }

    /**
     * @param roster
     */
    public static void printOldAgedFemale(List<Person> roster, PersonTester tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.print();
            }
        }
    }
}
