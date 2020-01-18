package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void whenExists() {
        boolean result = Triangle.exists(2, 2, 2);
        assertThat(result, is(true));
    }

    @Test
    public void whenDoesNotExist() {
        boolean result = Triangle.exists(1, 1, 5);
        assertThat(result, is(false));
    }
}
