package com.accelya.traing.java8.session1;

import java.util.List;

/**
 * Created by S00268 on 27/02/2018.
 */
public class Approach2 {


    /**
     * @param argc
     */
    public static void main(String[] argc) {
        List<Person> persons = PersonDataSource.getPersons();
        printPersonsWithinRange(persons, 30, 40);
    }

    /**
     * @param roster
     * @param low
     * @param high
     */
    public static void printPersonsWithinRange(List<Person> roster, int low, int high) {
        for (Person p : roster) {
            if (p.getAge() >= low && p.getAge() < high) {
                p.print();
            }
        }
    }
}
