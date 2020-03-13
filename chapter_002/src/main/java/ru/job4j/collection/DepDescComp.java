package ru.job4j.collection;

import java.util.Comparator;

/**
 * Comparator for department type strings
 *
 * @author Alex Dotsyak
 * @version 1
 * @since 0.1
 */
public class DepDescComp implements Comparator<String> {

    /**
     * Departments will be sorted in a way, in which
     * main departments must be sorted by descending
     * and others by ascending
     *
     * @param o1 - first string
     * @param o2 - second string
     * @return 1 - if o1 must be before o2,
     * -1 - if o1 must be after o2,
     * 0 - if they are equal
     */
    @Override
    public int compare(String o1, String o2) {

        if (!o1.contains("/") && !o2.contains("/")) {
            return o2.compareTo(o1);
        }

        String[] firstEl = o1.substring(o1.indexOf('/') + 1).split("/");
        String[] secondEl = o2.substring(o2.indexOf('/') + 1).split("/");


        int lastI1 = o1.contains("/") ? o1.indexOf('/') : o1.length();
        int lastI2 = o2.contains("/") ? o2.indexOf('/') : o2.length();

        String mainSeg1 = o1.substring(0, lastI1);
        String mainSeg2 = o2.substring(0, lastI2);

        if (!mainSeg1.equals(mainSeg2)) {
            return mainSeg2.compareTo(mainSeg1);
        }

        int size = Math.min(firstEl.length, secondEl.length);

        for (int i = 0; i < size; i++) {

            if (firstEl[i].equals(secondEl[i]) && i == size - 1) {
                return firstEl.length < secondEl.length ? 1 : -1;
            } else if (!firstEl[i].equals(secondEl[i])) {
                return firstEl[i].compareTo(secondEl[i]);
            }
        }

        if (firstEl.length == secondEl.length) {
            for (int i = 0; i < firstEl.length; i++) {
                if (!firstEl[i].equals(secondEl[i])) {
                    return secondEl[i].compareTo(firstEl[i]);
                }
            }
        }

        return 0;

    }
}
