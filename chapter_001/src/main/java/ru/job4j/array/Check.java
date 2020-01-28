package ru.job4j.array;

/**
 * Class works with boolean arrays
 *
 * @author Alex Dotsyak
 * @version 1
 */
public class Check {

    /**
     * Method returns true if input is mono, false if not
     *
     * @param data - input array of booleans
     * @return boolean
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        if (data.length > 1) {
            for (int index = 1; index != data.length; index++) {
                if (data[index] != data[0]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
