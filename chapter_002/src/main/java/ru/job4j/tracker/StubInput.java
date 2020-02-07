package ru.job4j.tracker;

/**
 * Input class that works without console
 *
 * @author Alex Dotsyak
 * @version 1
 * @since 02.08.2020
 */
public class StubInput implements Input {

    /**
     * Input array
     */
    private String[] args;
    /**
     * Recent position in input array
     */
    private int position = 0;

    @Override
    public String askString(String question) {
        return args[position++];
    }

    @Override
    public int askInt(String question) {
        return Integer.parseInt(askString(question));
    }

    /**
     * Initializes input
     *
     * @param args - input
     */
    public StubInput(String[] args) {
        this.args = args;
    }
}
