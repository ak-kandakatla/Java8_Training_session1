package com.accelya.traing.java8.session1;

import java.util.Arrays;
import java.util.List;

/**
 * Created by S00268 on 27/02/2018.
 */
public class PersonWithAddressDataSource {

    public static List<Person> getPersons() {

        return Arrays.asList(new Person("Peter ", 28, Person.Sex.MALE, "peter@sample.com", Arrays.asList(new Address
                        (Address.AddressType.HOME, "711-2880 Nulla St.", "Mankato Mississippi",
                                "US", "96522"), new Address
                        (Address.AddressType.BUSINESS, "666-4366 Lacinia Avenue", "Idaho Falls Ohio", "US", "19253"))),

                new Person("John Doe ", 32, Person.Sex.MALE, "john.deo@sample.com", Arrays.asList(new Address
                        (Address.AddressType.HOME, "P.O. Box 147 2546 Sociosqu Rd.", "Bethlehem Utah", "US", "02913"), new Address
                        (Address.AddressType.BUSINESS, "557-6308 Lacinia Road", "San Bernardino ND", "US", "09289")))
        );
    }


}
