package com.accelya.traing.java8.session1;

import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by S00268 on 27/02/2018.
 */
@Data
@NoArgsConstructor
@Slf4j
public class Person {

    public enum Sex {
        MALE, FEMALE;
    }

    String name;
    String email;
    Sex gender;
    int age;

    List<Address> addresses;

    /**
     * @param name
     * @param age
     * @param gender
     * @param email
     */
    public Person(String name, int age, Sex gender, String email) {
        this.age = age;
        this.email = email;
        this.gender = gender;
        this.name = name;
    }

    /**
     * @param name
     * @param age
     * @param gender
     * @param email
     * @param addresses
     */
    public Person(String name, int age, Sex gender, String email, List<Address> addresses) {
        this.age = age;
        this.email = email;
        this.gender = gender;
        this.name = name;
        this.addresses = addresses;
    }

    /**
     *
     */
    public void print() {
        log.debug(this.toString());
    }
}

