package ru.job4j.loop;

public class Factorial {
    public int calc(int value) {
        int result = 1;
        for (int index = 1; index <= value; index++) {
            result *= index;
        }
        return result;
    }
}
