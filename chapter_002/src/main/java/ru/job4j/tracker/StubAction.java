package ru.job4j.tracker;

/**
 * Class checks if actions within it were called
 *
 * @author Alex Dotsyak
 * @version 1
 */
public class StubAction implements UserAction {
    /**
     * Marks if action was called
     */
    private boolean call = false;

    @Override
    public String name() {
        return "Stub action";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        call = true;
        return false;
    }

    /**
     * Get call
     *
     * @return - call
     */
    public boolean isCall() {
        return call;
    }
}
