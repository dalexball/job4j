package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Test class for MatrixCheck class
 *
 * @author Alex Dotsyak
 */
public class MatrixCheckTest {

    /**
     * Method checks if result of monoHorizontal method is true for mono row
     */
    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 1);
        assertThat(result, is(true));
    }


    /**
     * Method checks if result of monoHorizontal method is false for not mono row
     */
    @Test
    public void whenNotMonoHorizontal() {
        char[][] input = {
                {' ', 'X', ' '},
                {'X', ' ', 'X'},
                {' ', 'X', ' '},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 1);
        assertThat(result, is(false));
    }

    /**
     * Method checks if result of monoVertical method is true for mono column
     */
    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        boolean result = MatrixCheck.monoVertical(input, 2);
        assertThat(result, is(true));
    }

    /**
     * Method checks if result of monoVertical method is false for not mono column
     */
    @Test
    public void whenNotMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', 'X', ' '},
                {'X', ' ', ' '},
        };
        boolean result = MatrixCheck.monoVertical(input, 2);
        assertThat(result, is(false));
    }

}
