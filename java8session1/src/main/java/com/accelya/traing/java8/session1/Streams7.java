package com.accelya.traing.java8.session1;

/**
 * Created by S00268 on 28/02/2018.
 */
public class Streams7 {

    public static void main(String[] argc) {
        PersonWithAddressDataSource.getPersons().stream()
                .flatMap(person -> person.getAddresses().stream())
                .filter(address -> address.getType() == Address.AddressType.BUSINESS)
                .forEach(System.out::println);

    }
}
