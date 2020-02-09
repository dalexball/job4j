package ru.job4j.strategy;

import org.junit.Test;

import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test class for Square class
 *
 * @author Alex Dotsyak
 * @version 0.1
 * @since 0.1
 */
public class SquareTest {
    /**
     * Checks if square.draw() draws pseudo-square
     */
    @Test
    public void whenDrawSquare() {
        Square square = new Square();
        assertThat(
                square.draw(),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("XXXX")
                                .add("X  X")
                                .add("X  X")
                                .add("XXXX")
                                .toString()
                )
        );
    }
}
