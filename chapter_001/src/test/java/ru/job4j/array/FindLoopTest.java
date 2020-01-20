package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    /**
     * Checks if method indexOf works fine with value 5
     */
    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{5, 3, 15};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    /**
     * Checks if method indexOf works fine when there's no searched element in array
     */
    @Test
    public void whenArrayDoesNotHaveElem() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{1, 2, 3, 4};
        int value = 6;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    /**
     * Checks if method works fine if range contains value
     */
    @Test
    public void whenFind() {
        int[] input = new int[]{5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    /**
     * Checks if method works fine if no value within range
     */
    @Test
    public void whenDoesNotFind() {
        int[] input = new int[]{5, 2, 10, 2, 4};
        int value = 6;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }
}
