package ru.job4j.array;

/**
 * Test class for MinDiapason class
 *
 * @author Alex Dotsyak
 */

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinDiapasonTest {

    /**
     * Checks if method works fine when first element is minimal
     */
    @Test
    public void whenFirstMin() {
        assertThat(
                MinDiapason.findMin(
                        new int[]{-1, 0, 5, 10},
                        1, 3
                ),
                is(0)
        );
    }

    /**
     * Checks if method works fine when last element is minimal
     */
    @Test
    public void whenLastMin() {
        assertThat(
                MinDiapason.findMin(
                        new int[]{10, 5, 3, 1},
                        1, 3
                ),
                is(1)
        );
    }

    /**
     * Checks if method works fine when middle element is minimal
     */
    @Test
    public void whenMiddleMin() {
        assertThat(
                MinDiapason.findMin(
                        new int[]{10, 2, 5, 1},
                        0, 2
                ),
                is(2)
        );
    }
}
