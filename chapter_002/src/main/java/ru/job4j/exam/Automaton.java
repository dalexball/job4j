package ru.job4j.exam;

import java.util.Arrays;

/**
 * Class models automaton that returns money
 *
 * @author Alex Dotsyak
 * @version 1
 * @since 0.1
 */
public class Automaton {

    /**
     * Method calculates rest of money, that should be given to user
     * with coins of different nominal
     *
     * @param input - input money
     * @param price - price
     * @return array of coin values
     */
    public int[] returnMoney(int input, int price) {
        int sum = input - price;
        int[] nominal = {10, 5, 1};
        int[] rest = new int[sum];
        int j = 0;
        for (int value : nominal) {
            while ((sum - value) >= 0) {
                sum -= value;
                rest[j++] = value;
            }
        }
        rest = Arrays.copyOf(rest, j);
        return rest;
    }
}
