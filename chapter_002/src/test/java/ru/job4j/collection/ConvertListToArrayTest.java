package ru.job4j.collection;

import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test class for ConvertListToArray class
 *
 * @author Alex Dotsyak
 * @version 1
 * @since 0.1
 */
@Ignore
public class ConvertListToArrayTest {

    /**
     * Method checks if 3x3 array would be created in case of 7 elements in array
     */
    @Test
    public void when7ElementsThen9() {
        int[][] result = ConvertListToArray.toArray(
                List.of(1, 2, 3, 4, 5, 6, 7),
                3
        );
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0, 0}
        };
        assertThat(result, is(expect));
    }
}
