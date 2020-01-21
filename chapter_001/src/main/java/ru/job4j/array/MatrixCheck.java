package ru.job4j.array;

/**
 * Class contains method(s) that check(s) matrix for something
 *
 * @author Alex Dotsyak
 * @version 1
 */
public class MatrixCheck {
    /**
     * Method checks if specific row in input board is mono or not
     *
     * @param board - input array of arrays of chars
     * @param row   - row that is checked if it's mono
     * @return true if row is mono, false if not
     */
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        char etalon = board[row][0];
        for (int i = 1; i != board[row].length; i++) {
            if (board[row][i] != etalon) {
                result = false;
                break;
            }
        }
        return result;
    }
}
