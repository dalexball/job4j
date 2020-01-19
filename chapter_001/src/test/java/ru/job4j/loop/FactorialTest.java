package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {

    @Test
    public void calcTest() {
        Factorial factor = new Factorial();
        int result = factor.calc(6);
        assertThat(result, is(720));
    }

    @Test
    public void calcFor0() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(0);
        assertThat(result, is(1));
    }
}
