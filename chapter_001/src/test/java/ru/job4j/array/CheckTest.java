package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckTest {

    /**
     * Checks if method mono works fine if input array is odd
     */
    @Test
    public void whenOddArrayMono() {
        Check check = new Check();
        boolean[] input = new boolean[]{true, true, true};
        boolean result = check.mono(input);
        boolean expect = true;
        assertThat(result, is(expect));
    }

    /**
     * Checks if method mono works fine if input array is even
     */
    @Test
    public void whenEvenArrayNotMono() {
        Check check = new Check();
        boolean[] input = new boolean[]{true, false, false, true};
        boolean result = check.mono(input);
        boolean expect = false;
        assertThat(result, is(expect));
    }
}
