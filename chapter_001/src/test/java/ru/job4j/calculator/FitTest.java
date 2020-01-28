package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeight() {
        double in = 170;
        double expected = 80.5;
        double out = Fit.manWeight(in);
        double delta = 0.01;
        Assert.assertEquals(expected, out, delta);
    }

    @Test
    public void womanWeight() {
        double in = 150;
        double expected = 46;
        double out = Fit.womanWeight(in);
        double delta = 0.01;
        Assert.assertEquals(expected, out, delta);
    }

}