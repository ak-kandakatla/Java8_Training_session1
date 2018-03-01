package com.accelya.traing.java8.session1;

import java.util.stream.Stream;

/**
 * Created by S00268 on 28/02/2018.
 */
public class Streams1 {

    public static void main(String[] argc) {
        Stream stream = PersonDataSource.getPersonStream();
        stream.forEach(System.out::println);

        Stream stream1 = PersonDataSource.getPersonStreamUsingStreamOf();
        stream1.forEach(System.out::println);
    }
}
