package ru.job4j.tracker;

/**
 * Class uses singleton pattern with private holder class
 *
 * @author Alex Dotsyak
 * @version 1
 * @since 0.1
 */
public class TrackerSingleLazySecond {
    /**
     * Make constructor private to restrict usage
     */
    private TrackerSingleLazySecond() {
    }

    /**
     * Get instance of class
     *
     * @return class object
     */
    public static TrackerSingleLazySecond getInstance() {
        return Holder.INSTANCE;
    }

    /**
     * Initializes instance of class
     */
    private static final class Holder {
        private static final TrackerSingleLazySecond INSTANCE = new TrackerSingleLazySecond();
    }
}
