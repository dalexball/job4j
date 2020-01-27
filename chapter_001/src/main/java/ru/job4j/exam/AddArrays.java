package ru.job4j.exam;

/**
 * Class contains method(s) that composes array of two arrays
 *
 * @author Alex Dotsyak
 * version 1
 */
public class AddArrays {

    /**
     * Method combines sorted arrays while also self-sorting
     * * @param ar1 - first array
     * @param ar2 - second array
     * @return combined array
     */
    public int[] addArs(int[] ar1, int[] ar2) {
        int[] result = new int[(ar1.length + ar2.length)];
        int i1 = 0, i2 = 0;
        int resI = 0;
        for (; resI < result.length; resI++) {
            if (i1 < ar1.length && i2 < ar2.length) {
                if (ar1[i1] < ar2[i2]) {
                    result[resI] = ar1[i1];
                    i1++;
                } else {
                    result[resI] = ar2[i2];
                    i2++;
                }
            } else {
                break;
            }
        }
        for (; resI < result.length; resI++) {
            if (i1 == ar1.length) {
                result[resI] = ar2[i2];
                i2++;
            } else if (i2 == ar2.length) {
                result[resI] = ar1[i1];
                i1++;
            }
        }
        return result;
    }
}
