package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test class for SortSelected class
 *
 * @author Alex Dotsyak
 */

public class SortSelectedTest {

    /**
     * Tests if method sort works fine with array length of which is 5
     */
    @Test
    public void whenSort1() {
        int[] input = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    /**
     * Tests if method sort works fine with array length of which is 8
     */
    @Test
    public void whenSort2() {
        int[] input = new int[]{20, 63, 47, 3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{1, 2, 3, 4, 5, 20, 47, 63};
        assertThat(result, is(expect));
    }
}
