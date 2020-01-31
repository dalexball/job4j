package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for Point.class
 *
 * @author Alex Dotsyak
 * @version 2
 */
public class PointTest {

    /**
     * Checks if static version of method "distance" works fine
     */
    @Test
    public void distance() {
        Point first = new Point(0, 0);
        Point second = new Point(2, 0);
        double expected = 2;
        double out = Point.distance(first, second);
        Assert.assertEquals(expected, out, 0.01);
    }

    /**
     * Checks if non-static version of method "distance" works fine
     */
    @Test
    public void distance2() {
        Point first = new Point(5, 0);
        Point second = new Point(0, 0);
        double expected = 5;
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }
}
