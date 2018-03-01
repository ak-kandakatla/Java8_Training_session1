package com.accelya.traing.java8.session1;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by S00268 on 01/03/2018.
 */
@Data
@NoArgsConstructor
public class Address {
    public enum AddressType {
        BUSINESS, HOME
    }

    AddressType type;
    String addressLine;
    String city;
    String country;
    String zipCode;

    /**
     * @param addressLine
     * @param city
     * @param country
     * @param zipCode
     */
    public Address(AddressType type, String addressLine, String city, String country, String zipCode) {
        this.type = type;
        this.addressLine = addressLine;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
    }
}
