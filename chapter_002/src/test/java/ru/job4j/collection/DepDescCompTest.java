package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

/**
 * Tests DepDescComp class
 *
 * @author Alex Dotsyak
 * @version 1
 * @since 0.1
 */
public class DepDescCompTest {

    /**
     * If first element is lower on list - value must be greater than zero
     */
    @Test
    public void compare() {
        int rsl = new DepDescComp().compare(
                "K2/SK1/SSK2",
                "K2/SK1/SSK1"
        );
        assertThat(rsl, greaterThan(0));
    }

    /**
     * If first element is higher on the list - value must be less than zero
     */
    @Test
    public void whenUpDepartmentGoBefore() {
        int rsl = new DepDescComp().compare(
                "K2",
                "K2/SK1"
        );
        assertThat(rsl, lessThan(0));
    }

    /**
     * If departments are different - value must be greater than zero
     */
    @Test
    public void whenDifDeps() {
        int rsl = new DepDescComp().compare(
                "K1",
                "K2/SK1"
        );
        assertThat(rsl, greaterThan(0));
    }

    /**
     * Assert that list is sorted in the right way
     */
    @Test
    public void sortedList() {
        List<String> input = Arrays.asList("k1/sk1", "k2/sk1");
        List<String> expect = Arrays.asList("k2", "k2/sk1", "k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        result.sort(new DepDescComp());
        assertThat(result, is(expect));
    }
}
