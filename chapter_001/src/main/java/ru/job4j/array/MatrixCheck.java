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

    /**
     * Method checks if specific row in input board is mono or not
     *
     * @param board  - input array of arrays of chars
     * @param column - column that is checked if it's mono
     * @return true if column is mono, false if not
     */
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        char etalon = board[0][column];
        for (int i = 1; i != board.length; i++) {
            if (board[i][column] != etalon) {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Method creates array of chars that contains values of diagonal of input matrix of chars
     *
     * @param board - input matrix
     * @return array of chars that contains values of diagonal of input matrix of chars
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] result = new char[board.length];
        for (int i = 0; i != board.length; i++) {
            result[i] = board[i][i];
        }
        return result;
    }
}
