package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test class for Triangle.class
 *
 * @author Alex Dotsyak
 * @version 2
 */
public class TriangleTest {

    /**
     * Checks if static method "exists" works fine if result is true
     */
    @Test
    public void whenExists() {
        boolean result = Triangle.exists(2, 2, 2);
        assertThat(result, is(true));
    }

    /**
     * Checks if static method "exists" works fine if result is false
     */
    @Test
    public void whenDoesNotExist() {
        boolean result = Triangle.exists(1, 1, 5);
        assertThat(result, is(false));
    }

    /**
     * Checks if non-static method "exists" works fine
     */
    @Test
    public void whenExistsObject() {
        Point first = new Point(0, 0);
        Point second = new Point(3, 0);
        Point third = new Point(0, 3);
        Triangle triangle = new Triangle(first, second, third);
        boolean result = triangle.exists();
        assertThat(result, is(true));
    }
}
