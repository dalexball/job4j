package ru.job4j.tracker;

/**
 * Class uses singleton pattern with private static final field
 *
 * @author Alex Dotsyak
 * @version 1
 * @since 0.1
 */
public class TrackerSingleEager {
    /**
     * Instance of class
     */
    private static final TrackerSingleEager INSTANCE = new TrackerSingleEager();

    /**
     * Restricts access to constructor
     */
    private TrackerSingleEager() {
    }

    /**
     * @return instance of class
     */
    public static TrackerSingleEager getInstance() {
        return INSTANCE;
    }
}
