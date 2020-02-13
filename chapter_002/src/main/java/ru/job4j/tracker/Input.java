package ru.job4j.tracker;

/**
 * Interface that allows different versions of input to be used (w/ or w/o console)
 *
 * @author Alex Dotsyak
 * @version 1
 */
public interface Input {
    /**
     * Method should return input int value
     *
     * @return int value
     */
    int askInt(String question);

    /**
     * Method should return input string value
     *
     * @return - string value
     */
    String askString(String question);

    int askInt(String question, int max);
}
