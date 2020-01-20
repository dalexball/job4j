package ru.job4j.array;

/**
 * Class contains method that compares ending of array of chars with another array of char
 *
 * @author Alex Dotsyak
 * @version 1
 */
public class EndsWith {
    /**
     * Method compares ending of word with certain array of chars
     *
     * @param word - word that is compared
     * @param post - how word should end
     * @return boolean value that shows if ending of word is similar to input
     */
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int index = 1; index <= post.length; index++) {
            if (word[word.length - index] != post[post.length - index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
