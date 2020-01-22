package ru.job4j.array;

/**
 * Class contains method(s) that chang(es) positions of elements within input array
 *
 * @author Alex Dotsyak
 * @version 3
 */
public class Defragment {

    /**
     * @param array - input array
     * @return array with elements positions changed, if not null to be at the start,
     * if null - after those that aren't
     */
    public static String[] compress(String[] array) {
        for (int i = 0; i != array.length; i++) {
            int j = 0;
            if (array[i] == null) {
                while (array[i + j] == null && (i + j) < array.length - 1) {
                    j++;
                }
                array[i] = array[i + j];
                array[i + j] = null;
            }
        }
        return array;
    }
}
