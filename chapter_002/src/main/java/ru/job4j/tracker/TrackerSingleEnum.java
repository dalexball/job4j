package ru.job4j.tracker;

/**
 * Class uses singleton pattern with enum
 *
 * @author Alex Dotsyak
 * @version 1
 * @since 0.1
 */
public enum TrackerSingleEnum {
    /**
     * Instance of class
     */
    TRACKER_SINGLE;

    /**
     * @return Instance of class
     */
    public static TrackerSingleEnum getInstance() {
        return TRACKER_SINGLE;
    }

    /**
     * Add Item
     *
     * @param model - model
     * @return model
     */
    public Item add(Item model) {
        return model;
    }
}
