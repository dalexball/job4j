package ru.job4j.loop;

import org.junit.Test;
import ru.job4j.calculator.Fit;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FitnessTest {

    @Test
    public void whenIvanGreatNik() {
        Fitness fit = new Fitness();
        int result = fit.calc(95, 70);
        assertThat(result, is(0));
    }

    @Test
    public void whenIvanLessByOneNik() {
        Fitness fit = new Fitness();
        int result = fit.calc(70, 80);
        assertThat(result, is(1));
    }

    @Test
    public void whenIvanLessByFewNik() {
        Fitness fit = new Fitness();
        int result = fit.calc(40, 100);
        assertThat(result, is(3));
    }
}
