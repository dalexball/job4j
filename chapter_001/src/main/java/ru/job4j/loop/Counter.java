package ru.job4j.loop;

public class Counter {

    public static int add(int start, int finish) {
        int sum = 0;
        for (int curVal = start; curVal <= finish; curVal++) {
            if (curVal % 2 == 0) {
                sum += curVal;
            }
        }
        return sum;
    }
}
