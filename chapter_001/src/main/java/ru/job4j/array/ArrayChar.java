package ru.job4j.array;

/**
 * Class works with arrays of chars
 *
 * @author Alex Dotsyak
 * @version 1
 */
public class ArrayChar {

    /**
     * Method checks if word starts with certain prefix
     *
     * @param word - input word
     * @param pref - prefix of word
     * @return boolean: true if word starts with certain prefix, false if not
     */
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index != pref.length; index++) {
            if (word[index] != pref[index]) {
                result = false;
                break;
            }
        }
        return result;
    }

}
