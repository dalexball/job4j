package ru.job4j.collection;

import java.util.Comparator;

/**
 * Class compares strings
 *
 * @author Alex Dotsyak
 * @version 1
 * @since 0.1
 */
public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int result = 0;

        for (int i = 0; i < o1.length() && i < o2.length(); i++) {
            result = Character.compare(o1.charAt(i), o2.charAt(i));
            if (result != 0) {
                break;
            }
        }

        if (result == 0 && o1.length() != o2.length()) {
            if (o1.length() < o2.length()) {
                result = -1;
            } else {
                result = 1;
            }
        }

        return result;
    }
}
