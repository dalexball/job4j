package ru.job4j.array;

/**
 * Class looks for minimal value of specific range within array
 *
 * @author Alex Dotsyak
 * @version 1
 */
public class MinDiapason {

    /**
     * Method looks for minimal value of specific range within array
     *
     * @param array      - given array
     * @param startIndex - index at which search starts
     * @param finIndex   - index at which search finishes
     * @return - minimal value of range within array
     */
    public static int findMin(int[] array, int startIndex, int finIndex) {
        int min = array[startIndex];
        for (int i = startIndex + 1; i <= finIndex; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
