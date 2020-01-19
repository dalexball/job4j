package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckPrimeNumberTest {

    @Test
    public void val5() {
        boolean result = CheckPrimeNumber.check(5);
        assertThat(result, is(true));
    }

    @Test
    public void val8() {
        boolean result = CheckPrimeNumber.check(8);
        assertThat(result, is(false));
    }

}
