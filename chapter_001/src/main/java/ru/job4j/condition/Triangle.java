package ru.job4j.condition;

public class Triangle {
    public static boolean exists(double ab, double ac, double bc) {
        double sum = ab + ac;
        if (sum > bc) {
            sum = ab + bc;
            if (sum > ac) {
                sum = ac + bc;
                return sum > ab;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
