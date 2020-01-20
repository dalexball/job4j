package ru.job4j.array;

/**
 * Test class for ArrayChar class
 *
 * @author Alex Dotsyak
 * @version 1
 */

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayCharTest {

    /**
     * Checks if method startsWith of class ArrayChar works fine when word starts with certain prefix
     */
    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(true));
    }

    /**
     * Checks if method startsWith of class ArrayChar works fine when word does not start with certain prefix
     */
    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(false));
    }

}
