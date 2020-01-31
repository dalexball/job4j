package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Test class for Triangle.class
 *
 * @author Alex Dotsyak
 * @version 3
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

    /**
     * Checks if non-static method "area" works fine
     */
    @Test
    public void area() {
        Point first = new Point(0, 0);
        Point second = new Point(3, 0);
        Point third = new Point(0, 3);
        Triangle triangle = new Triangle(first, second, third);
        double result = triangle.area();
        double expected = 4.5;
        assertEquals(result, expected, 0.01);
    }

    /**
     * Checks if static method "area" works fine
     */
    @Test
    public void areaStatic() {
        double result = Triangle.area(3, 4, 5);
        double expected = 6;
        assertEquals(result, expected, 0.1);
    }
}
