package com.accelya.traing.java8.session1;

import java.util.List;

/**
 * Created by S00268 on 27/02/2018.
 */
public class Approach1 {


    /**
     * @param argc
     */
    public static void main(String[] argc) {
        List<Person> persons = PersonDataSource.getPersons();
        printPersonsOlderThan(persons, 40);
    }

    /**
     * @param roster
     * @param age
     */
    public static void printPersonsOlderThan(List<Person> roster, int age) {
        for (Person p : roster) {
            if (p.getAge() >= age) {
                p.print();
            }
        }
    }
}
