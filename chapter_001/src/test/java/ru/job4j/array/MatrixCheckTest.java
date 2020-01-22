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

    /**
     * Method checks if method extractDiagonal works fine
     */
    @Test
    public void whenDiagonal() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expect = {'X', 'X', 'X'};
        assertThat(result, is(expect));
    }

    /**
     * Checks if method isWin works fine if there is searched column
     */
    @Test
    public void whenDataMonoByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(true));
    }

    /**
     * Checks if method isWin works fine if no searched elements in diagonal
     */
    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(false));
    }

    /**
     * Checks if method works isWin works fine if row is full and column is not
     */
    @Test
    public void whenDataHMonoByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(true));
    }

}
