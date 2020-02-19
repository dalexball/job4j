package ru.job4j.exam;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test class for Automaton class
 *
 * @author Alex Dotsyak
 * @version 1
 * @since 0.1
 */
public class AutomatonTest {

    /**
     * Checks if method returnMoney works fine in standard situation
     */
    @Test
    public void whenFew() {
        Automaton automaton = new Automaton();
        int[] result = automaton.returnMoney(50, 35);
        assertThat(result, is(new int[]{10, 5}));
    }

    /**
     * Checks if method returnMoney works fine in standard situation
     */
    @Test
    public void whenOne() {
        Automaton automaton = new Automaton();
        int[] result = automaton.returnMoney(100, 99);
        assertThat(result, is(new int[]{1}));
    }

    /**
     * Checks if method returnMoney works fine when returns many coin values
     */
    @Test
    public void whenMany() {
        Automaton automaton = new Automaton();
        int[] result = automaton.returnMoney(100, 53);
        assertThat(result, is(new int[]{10, 10, 10, 10, 5, 1, 1}));
    }

    /**
     * Checks if method returnMoney works fine when returns nothing
     */
    @Test
    public void whenZero() {
        Automaton automaton = new Automaton();
        int[] result = automaton.returnMoney(100, 100);
        assertThat(result, is(new int[]{}));
    }

    /**
     * Checks if method returnMoney works fine when returns coin value 5
     */
    @Test
    public void whenFive() {
        Automaton automaton = new Automaton();
        int[] result = automaton.returnMoney(100, 95);
        assertThat(result, is(new int[]{5}));
    }
}
