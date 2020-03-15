package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Class creates list that contains values of function
 *
 * @author Alex Dotsyak
 * @version 1
 * @since 0.1
 */
public class Functionale {

    /**
     * Creates list that contains values of function of elements
     * from start to end
     *
     * @param start - start
     * @param end   - end
     * @param func  - function
     * @return list of values of function
     */
    List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> list = new ArrayList<>();
        for (double i = start; i < end; i++) {
            list.add(func.apply(i));
        }
        return list;
    }

}
