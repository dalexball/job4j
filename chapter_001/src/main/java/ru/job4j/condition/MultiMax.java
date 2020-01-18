package ru.job4j.condition;

public class MultiMax {
    public int max(int val1, int val2, int val3) {
        int result = val1;
        if (result < val2 || result < val3) {
            result = val2 > val3 ? val2 : val3;
        }
        return result;
    }
}
