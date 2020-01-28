package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance() {
        int inX1 = 0;
        int inY1 = 0;
        int inX2 = 2;
        int inY2 = 0;
        double expected = 2;
        double out = Point.distance(inX1, inY1, inX2, inY2);
        Assert.assertEquals(expected, out, 0.01);
    }
}