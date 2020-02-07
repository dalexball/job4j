package ru.job4j.tracker;

/**
 * Interface provides possibility to get name of specific action and execute it
 *
 * @author Alex Dotsyak
 * @version 1
 */
public interface UserAction {
    /**
     * Shows name of action
     *
     * @return string, name of action
     */
    String name();

    /**
     * Executes action
     *
     * @param input   - input class
     * @param tracker - tracker class
     * @return - boolean that shows if the program should be ran further or not
     */
    boolean execute(Input input, Tracker tracker);
}
