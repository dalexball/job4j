package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int yearQ = 0;
        percent *= 0.01;
        while (amount > 0) {
            amount *= (1 + percent);
            amount -= salary;
            ++yearQ;
        }
        return yearQ;
    }
}
