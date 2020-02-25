package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Class converts list of arrays to list
 *
 * @author Alex Dotsyak
 * @version 1
 * @since 0.1
 */
public class ConvertList {

    /**
     * Method converts list of arrays to list
     *
     * @param list - input list that contains arrays of int
     * @return list that contains int
     */
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> result = new ArrayList<>();

        for (int[] array : list) {
            for (int num : array) {
                result.add(num);
            }
        }

        return result;
    }

}
