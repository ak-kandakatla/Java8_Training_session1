package com.accelya.traing.java8.session1;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by S00268 on 28/02/2018.
 */
public class ElementProcessor<T, V> {
    /**
     * @param roster
     */
    public static <T, V> void processElement(List<T> roster, Predicate<T> tester, Consumer<T> block,
                                             Function<T, V> mapper) {
        for (T p : roster) {
            if (tester.test(p)) {
                V data = mapper.apply(p);
                block.accept(p);
            }
        }
    }
}
