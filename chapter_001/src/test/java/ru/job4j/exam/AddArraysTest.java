package ru.job4j.exam;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test class for AddArrays class
 *
 * @author Alex Dotsyak
 */
public class AddArraysTest {

    /**
     * Checks if method addArrays works fine if input arrays are same
     */
    @Test
    public void addSame() {
        AddArrays addArrays = new AddArrays();
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] result = addArrays.addArs(array1, array2);
        int[] expect = {1, 1, 2, 2, 3, 3};
        assertThat(result, is(expect));
    }

    /**
     * Checks if method addArrays works fine if first array is shorter than second
     * and its last value is greater than value of second arrays value with same index
     */
    @Test
    public void firstMistake() {
        AddArrays addArrays = new AddArrays();
        int[] array1 = {1, 6};
        int[] array2 = {1, 5, 9, 11};
        int[] result = addArrays.addArs(array1, array2);
        int[] expect = {1, 1, 5, 6, 9, 11};
        assertThat(result, is(expect));
    }

}
