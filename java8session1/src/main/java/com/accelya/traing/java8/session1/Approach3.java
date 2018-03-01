package com.accelya.traing.java8.session1;

import java.util.List;

/**
 * Created by S00268 on 27/02/2018.
 */
public class Approach3 {


    /**
     * @param argc
     */
    public static void main(String[] argc) {
        List<Person> persons = PersonDataSource.getPersons();
        printMiddleAgedMale(persons, new MiddleAgedMan());
    }

    /**
     * @param roster
     */
    public static void printMiddleAgedMale(List<Person> roster, PersonTester tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.print();
            }
        }
    }
}
