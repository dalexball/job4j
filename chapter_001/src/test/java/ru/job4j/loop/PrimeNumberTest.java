package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PrimeNumberTest {

    @Test
    public void quantity1() {
        PrimeNumber primeQ = new PrimeNumber();
        int result = primeQ.calc(1);
        assertThat(result, is(1));
    }

    @Test
    public void quantity5() {
        PrimeNumber primeQ = new PrimeNumber();
        int result = primeQ.calc(7);
        assertThat(result, is(5));
    }

}
