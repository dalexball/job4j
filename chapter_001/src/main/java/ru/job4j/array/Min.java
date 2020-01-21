package ru.job4j.array;

/**
 * Class contains method(s) that look(s) for the lowest value element within given array
 *
 * @author Alex Dotsyak
 * @version 1
 */
public class Min {
    /**
     * Method looks for the lowest value element
     *
     * @param array - array within which the search is made
     * @return lowest value element of array
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 1; index != array.length; index++) {
            if (min > array[index]) {
                min = array[index];
            }
        }
        return min;
    }
}
