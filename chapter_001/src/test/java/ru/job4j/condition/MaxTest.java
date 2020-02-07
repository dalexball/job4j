package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test class for Max.class
 *
 * @author Alex Dotsyak
 * @version 2
 */
public class MaxTest {

    @Test
    public void firstValHigherThanSecond() {
        int result = Max.max(3, 1);
        assertThat(result, is(3));
    }

    @Test
    public void secondValHigherThanFirst() {
        int result = Max.max(1, 5);
        assertThat(result, is(5));
    }

    @Test
    public void bothEqual() {
        int result = Max.max(4, 4);
        assertThat(result, is(4));
    }

    @Test
    public void thirdHighest() {
        int result = Max.max(1, 2, 3);
        assertThat(result, is(3));
    }

    @Test
    public void fourthHighest() {
        int result = Max.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }
}
