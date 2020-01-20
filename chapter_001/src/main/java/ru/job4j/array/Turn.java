package ru.job4j.array;

/**
 * Class changes positions of elements in arrays
 *
 * @author Alex Dotsyak
 * @version 1
 */
public class Turn {
    /**
     * Method turns array backwards
     *
     * @param array - array
     * @return array backwards
     */
    public int[] backwards(int[] array) {
        double numberOfOperations = array.length;
        numberOfOperations /= 2;
        for (int index = 0; index < numberOfOperations; index++) {
            int temp = array[index];
            array[index] = array[array.length - 1 - index];
            array[array.length - 1 - index] = temp;
        }
        return array;
    }
}
