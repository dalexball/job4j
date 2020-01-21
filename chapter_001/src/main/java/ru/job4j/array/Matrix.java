package ru.job4j.array;

/**
 * Class works with matrix
 *
 * @author Alex Dotsyak
 * @version 1
 */
public class Matrix {

    /**
     * Method creates multiple table of given size
     *
     * @param size - defines last multiplied elements
     * @return table of multiplying
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i != size; i++) {
            for (int j = 0; j != size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
