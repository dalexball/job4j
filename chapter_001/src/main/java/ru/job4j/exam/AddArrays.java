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
     *
     * @param ar1 - first array
     * @param ar2 - second array
     * @return combined array
     */
    public int[] addArs(int[] ar1, int[] ar2) {
        int[] resArray = new int[(ar1.length + ar2.length)];
        int firstArIndex = 0, secondArIndex = 0;
        int i = 0;
        while (i < resArray.length) {
            if (secondArIndex < ar2.length) {
                while (firstArIndex < ar1.length && ar1[firstArIndex] < ar2[secondArIndex]) {
                    resArray[i] = ar1[firstArIndex];
                    i++;
                    firstArIndex++;
                }
            } else {
                while (firstArIndex < ar1.length) {
                    resArray[i] = ar1[firstArIndex];
                    i++;
                    firstArIndex++;
                }
            }
            if (firstArIndex < ar1.length) {
                while (secondArIndex < ar2.length && ar2[secondArIndex] < ar1[firstArIndex]) {
                    resArray[i] = ar2[secondArIndex];
                    i++;
                    secondArIndex++;
                }
            } else {
                while (secondArIndex < ar2.length) {
                    resArray[i] = ar2[secondArIndex];
                    i++;
                    secondArIndex++;
                }
            }
            if (firstArIndex < ar1.length && secondArIndex < ar2.length && ar1[firstArIndex] == ar2[secondArIndex]) {
                resArray[i] = ar1[firstArIndex];
                i++;
                firstArIndex++;
                resArray[i] = ar2[secondArIndex];
                i++;
                secondArIndex++;
            }
        }
        return resArray;
    }
}
