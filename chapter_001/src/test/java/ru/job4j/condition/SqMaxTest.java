package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {

    @Test
    public void firstMax() {
        int result = SqMax.max(5, 4, 3, 2);
        assertThat(result, is(5));
    }

    @Test
    public void secondMax() {
        int result = SqMax.max(7, 9, 4, 5);
        assertThat(result, is(9));
    }

    @Test
    public void thirdMax() {
        int result = SqMax.max(6, 10, 15, 8);
        assertThat(result, is(15));
    }

    @Test
    public void forthMax() {
        int result = SqMax.max(6, 12, 20, 25);
        assertThat(result, is(25));
    }

    @Test
    public void allEqual() {
        int result = SqMax.max(7, 7, 7, 7);
        assertThat(result, is(7));
    }
}
