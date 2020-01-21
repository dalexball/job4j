package ru.job4j.array;

/**
 * Class contains method that swaps elements in array
 *
 * @author Alex Dotsyak
 * @version 1
 */
public class Swap {
    /**
     * Method swaps elements in array by their indexes
     *
     * @param array       - given array
     * @param firstIndex  - index of first element
     * @param secondIndex - index of second element
     */
    public static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}
