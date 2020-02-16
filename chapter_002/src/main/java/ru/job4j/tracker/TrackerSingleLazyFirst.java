package ru.job4j.tracker;

/**
 * Class uses singleton pattern
 *
 * @author Alex Dotsyak
 * @version 1
 * @since 0.1
 */
public class TrackerSingleLazyFirst {

    /**
     * Instance of class
     */
    private static TrackerSingleLazyFirst instance;

    /**
     * Restricts access to constructor
     */
    private TrackerSingleLazyFirst() {
    }

    /**
     * Get instance of class, if it doesn't exist, create one
     *
     * @return instance of class
     */
    public static TrackerSingleLazyFirst getInstance() {
        if (instance == null) {
            instance = new TrackerSingleLazyFirst();
        }
        return instance;
    }

    /**
     * Adds Item
     *
     * @param model - model
     * @return model
     */
    public Item add(Item model) {
        return model;
    }
}
