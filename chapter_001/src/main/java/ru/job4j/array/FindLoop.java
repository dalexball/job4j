package ru.job4j.array;

/**
 * Class looks for elements in arrays
 *
 * @author Alex Dotsyak
 * @version 1
 */
public class FindLoop {
    /**
     * Method returns first index of searched element if there is one
     *
     * @param data - input array
     * @param elem - searched element
     * @return first index of searched element
     */
    public int indexOf(int[] data, int elem) {
        int rst = -1;//if no element - return -1
        for (int index = 0; index != data.length; index++) {
            if (data[index] == elem) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    /**
     * Method looks for element in array within specific range
     *
     * @param data       - array, in which element is searched
     * @param elem       - element that is looked for
     * @param startIndex - first index of range
     * @param finIndex   - last index of range
     * @return first index of searched element within range
     */
    public static int indexOf(int[] data, int elem, int startIndex, int finIndex) {
        int rst = -1;//if no element - return -1
        for (; startIndex != finIndex; startIndex++) {
            if (data[startIndex] != elem) {
                rst = startIndex;
                break;
            }
        }
        return rst;
    }
}
