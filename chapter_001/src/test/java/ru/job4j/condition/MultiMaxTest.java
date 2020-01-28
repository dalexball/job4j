package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void firstValHighest() {
        MultiMax check = new MultiMax();
        int result = check.max(3, 2, 1);
        assertThat(result, is(3));
    }

    @Test
    public void secondValHighest() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 6, 4);
        assertThat(result, is(6));
    }

    @Test
    public void thirdValHighest() {
        MultiMax check = new MultiMax();
        int result = check.max(3, 5, 15);
        assertThat(result, is(15));
    }

    @Test
    public void allEqual() {
        MultiMax check = new MultiMax();
        int result = check.max(5, 5, 5);
        assertThat(result, is(5));
    }
}
