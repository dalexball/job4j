package ru.job4j.array;

/**
 * Class contains methods that sort arrays
 *
 * @author Alex Dotsyak
 * @version 1
 */
public class SortSelected {

    /**
     * Method sorts array from lower to higher values
     *
     * @param data - input array
     * @return sorted array
     */
    public static int[] sort(int[] data) {
        FindLoop findLoop = new FindLoop();
        for (int i = 0; i != (data.length - 1); i++) {
            int minElemWithinRange = MinDiapason.findMin(data, i, (data.length - 1));
            int indexOfMinElem = findLoop.indexOf(data, minElemWithinRange);
            Swap.swap(data, i, indexOfMinElem);
        }
        return data;
    }
}
