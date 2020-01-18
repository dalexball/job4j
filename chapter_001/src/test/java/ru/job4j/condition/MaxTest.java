package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class MaxTest {

    @Test
    public void firstValHigherThanSecond() {
        int result = Max.max(3, 1);
        assertThat(result, is(3));
    }

    @Test
    public void secondValHigherThanFirst() {
        int result = Max.max(1, 5);
        assertThat(result, is(5));
    }

    @Test
    public void bothEqual() {
        int result = Max.max(4, 4);
        assertThat(result, is(4));
    }
}
