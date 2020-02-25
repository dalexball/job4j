package ru.job4j.collection;

import java.util.List;

/**
 * Class converts list to array
 *
 * @author Alex Dotsyak
 * @version 1
 * @since 0.1
 */
public class ConvertListToArray {

    /**
     * Method converts list to two-dim array
     *
     * @param list  - list
     * @param cells - number of cells in a row
     * @return two-dim array
     */
    public static int[][] toArray(List<Integer> list, int cells) {

        int groups = (int) Math.ceil((double) list.size() / cells);
        int[][] result = new int[groups][cells];

        int row = 0, cell = 0;

        for (Integer num : list) {
            result[row][cell++] = num;
            if (cell >= cells) {
                row++;
                cell = 0;
            }
        }

        return result;
    }

}
