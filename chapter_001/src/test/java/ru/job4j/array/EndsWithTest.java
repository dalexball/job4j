package ru.job4j.array;

/**
 * Test class for EndsWith class
 *
 * @author Alex Dotsyak
 */

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class EndsWithTest {

    /**
     * Checks if method works for right ending
     */
    @Test
    public void whenEndRightThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }

    /**
     * Checks if method works for wrong ending
     */
    @Test
    public void whenNotEndRightThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }
}
