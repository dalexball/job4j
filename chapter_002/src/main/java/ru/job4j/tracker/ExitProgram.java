package ru.job4j.tracker;

/**
 * Stops program
 *
 * @author Alex Dotsyak
 * @version 1
 */
public class ExitProgram implements UserAction {

    @Override
    public String name() {
        return "Exit Program";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        return false;
    }
}
