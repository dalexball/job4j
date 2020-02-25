package ru.job4j.list;

import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test class for ConvertMatrixToList class
 *
 * @author Alex Dotsyak
 * @version 1
 * @since 0.1
 */
public class ConvertMatrixToListTest {

    /**
     * Checks if converted list contains 4 elements if input was 2x2 array
     */
    @Test
    public void when2on2ArrayThenList4() {
        ConvertMatrixToList list = new ConvertMatrixToList();
        int[][] input = {
                {1, 2},
                {3, 4}
        };
        List<Integer> expect = Arrays.asList(
                1, 2, 3, 4
        );
        List<Integer> result = list.toList(input);
        assertThat(result, is(expect));
    }
}