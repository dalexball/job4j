package ru.job4j.array;

/**
 * Test class for Min class
 */

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinTest {

    /**
     * Checks method findMind if first element is searched
     */
    @Test
    public void whenFirstMin() {
        assertThat(Min.findMin(new int[]{0, 5, 10}), is(0));
    }

    /**
     * Checks method findMind if last element is searched
     */
    @Test
    public void whenLastMin() {
        assertThat(Min.findMin(new int[]{10, 5, 3}), is(3));
    }

    /**
     * Checks method findMind if middle element is searched
     */
    @Test
    public void whenMiddleMin() {
        assertThat(Min.findMin(new int[]{10, 2, 5}), is(2));
    }
}
