package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Class converts matrix to list
 *
 * @author Alex Dotsyak
 * @version 1
 * @since 0.1
 */
public class ConvertMatrixToList {

    /**
     * Converts two-dim array into list
     *
     * @param array - input array
     * @return list
     */
    public List<Integer> toList(int[][] array) {
        List<Integer> result = new ArrayList<>();

        for (int[] row : array) {
            for (int cell : row) {
                result.add(cell);
            }
        }

        return result;
    }

}
