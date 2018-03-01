package com.accelya.traing.java8.session1;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by S00268 on 28/02/2018.
 */
public class Streams2 {

    public static void main(String[] argc) {

        IntStream.range(1, 4)
                .forEach(System.out::println);

        Arrays.stream(new int[]{1, 2, 3})
                .map(n -> 2 * n + 1)
                .average()
                .ifPresent(System.out::println);

        Stream.of("a1", "a2", "a3")
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);
    }
}
