package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int value) {
        boolean prime;
        for (int index = 2; index < value; ++index) {
            if (value % index == 0) {
                prime = false;
                return prime;
            }
        }
        prime = true;
        return prime;
    }
}
