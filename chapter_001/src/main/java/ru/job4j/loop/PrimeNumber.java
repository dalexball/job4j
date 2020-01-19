package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int value) {
        int quantity = 0;
        for (int curVal = 1; curVal <= value; ++curVal) {
            if (CheckPrimeNumber.check(curVal)) {
                ++quantity;
            }
        }
        return quantity;
    }
}
