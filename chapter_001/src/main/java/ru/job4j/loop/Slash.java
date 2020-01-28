package ru.job4j.loop;

/**
 * Class paints crosses.
 *
 * @author Alex Dotsyak
 * @version 1
 */

public class Slash {

    /**
     * Method draws crosses of given size
     *
     * @param size - size of cross
     */
    public static void paintCross(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = cell == row;
                boolean right = (row + cell) == size - 1;
                if (left) {
                    System.out.print('X');
                } else if (right) {
                    System.out.print('X');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Draw by 3.");
        paintCross(3);
        System.out.println();
        System.out.println("Draw by 7.");
        paintCross(7);
    }
}
