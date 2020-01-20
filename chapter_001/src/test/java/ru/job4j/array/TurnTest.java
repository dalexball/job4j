package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TurnTest {

    /**
     * Checks if method turn works fine with array that contains odd number of elements
     */
    @Test
    public void turnOddArray() {
        Turn turn = new Turn();
        int[] input = new int[]{1, 2, 3, 4, 5};
        int[] expect = new int[]{5, 4, 3, 2, 1};
        int[] result = turn.backwards(input);
        assertThat(result, is(expect));
    }

    /**
     * Checks if method turn works fine with array that contains even number of elements
     */
    @Test
    public void turnEvenArray() {
        Turn turn = new Turn();
        int[] input = new int[]{1, 2, 3, 4, 5, 6};
        int[] expect = new int[]{6, 5, 4, 3, 2, 1};
        int[] result = turn.backwards(input);
        assertThat(result, is(expect));
    }
}
