package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

/**
 * Test class for Functionale class
 *
 * @author Alex Dotsyak
 * @version 1
 * @since 0.1
 */
public class FunctionaleTest {

    /**
     * Asserts that diapason method returns correct list of values
     * of linear function
     */
    @Test
    public void whenLinearFunctionThenLinearResults() {
        Functionale function = new Functionale();
        List<Double> result = function.diapason(5, 8, x -> x * 2 + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    /**
     * Asserts that diapason method returns correct list of values
     * of square function
     */
    @Test
    public void whenSquareFunction() {
        Functionale function = new Functionale();
        List<Double> result = function.diapason(3, 6, x -> Math.pow(x, 2));
        List<Double> expected = Arrays.asList(9D, 16D, 25D);
        assertThat(result, is(expected));
    }

    /**
     * Asserts that diapason method returns correct list of values
     * of natural logarithm function
     */
    @Test
    public void whenLogFunction() {
        Functionale function = new Functionale();
        List<Double> result = function.diapason(3, 6, Math::log);
        List<Double> expected = Arrays.asList(1.09, 1.38, 1.6);
        for (int i = 0; i < result.size(); i++) {
            assertEquals(result.get(i), expected.get(i), 0.1);
        }
    }
}
