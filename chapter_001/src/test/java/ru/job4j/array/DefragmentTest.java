package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DefragmentTest {

    /**
     * Checks if method compress works fine if first element is not null
     */
    @Test
    public void notFirstNull() {
        String[] input = {"I", null, "wanna", null, "be", null, null, "compressed"};
        String[] compressed = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null, null};
        assertThat(compressed, is(expected));
    }

    /**
     * Checks if method compress works fine if first element is null
     */
    @Test
    public void firstNull() {
        String[] input = {null, "I", "wanna", null, "be", null, "compressed", null};
        String[] compressed = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null, null};
        assertThat(compressed, is(expected));
    }

    /**
     * Checks if method compress works fine if input contains no nulls
     */
    @Test
    public void ifNoNulls() {
        String[] input = {"I", "wanna", "be", "compressed"};
        String[] compressed = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed"};
        assertThat(compressed, is(expected));
    }

    /**
     * Checks if method compress works fine if input only contains null elements
     */
    @Test
    public void ifAllNulls() {
        String[] input = {null, null, null, null};
        String[] compressed = Defragment.compress(input);
        String[] expected = {null, null, null, null};
        assertThat(compressed, is(expected));
    }
}
