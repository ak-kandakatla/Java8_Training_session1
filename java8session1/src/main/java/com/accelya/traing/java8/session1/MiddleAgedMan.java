package com.accelya.traing.java8.session1;

/**
 * Created by S00268 on 27/02/2018.
 */
public class MiddleAgedMan implements PersonTester {
    @Override
    public boolean test(Person p) {
        return p.getGender() == Person.Sex.MALE && p.getAge() >= 25 && p.getAge() < 40;
    }
}
