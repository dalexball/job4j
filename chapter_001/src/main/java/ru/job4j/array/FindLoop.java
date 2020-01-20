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
}
