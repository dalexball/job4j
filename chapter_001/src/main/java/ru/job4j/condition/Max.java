package ru.job4j.condition;

/**
 * Utility class for finding highest number
 *
 * @author Alex Dotsyak
 * @version 2
 */
public class Max {
    /**
     * Find highest between two
     *
     * @param firstVal  - firstVal
     * @param secondVal - secondVal
     * @return highest
     */
    public static int max(int firstVal, int secondVal) {
        int result;
        boolean higher = firstVal >= secondVal;
        result = higher ? firstVal : secondVal;
        return result;
    }

    /**
     * Find highest between three
     *
     * @param firstVal  - firstVal
     * @param secondVal - secondVal
     * @param thirdVal  -thirdVal
     * @return highest
     */
    public static int max(int firstVal, int secondVal, int thirdVal) {
        int result;
        result = max(firstVal, max(secondVal, thirdVal));
        return result;
    }

    public static int max(int firstVal, int secondVal, int thirdVal, int fourthVal) {
        int result;
        result = max(max(firstVal, secondVal, thirdVal), fourthVal);
        return result;
    }
}
