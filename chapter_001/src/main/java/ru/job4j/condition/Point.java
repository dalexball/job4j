package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return (Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2)));
    }

    public static void main(String[] args) {
        double result = distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) is " + result);
        result = distance(1, 1, 5, 4);
        System.out.println("result (1, 2) to (5, 4) is " + result);
        result = distance(3, 15, 3, 15);
        System.out.println("result (3, 15) to (3, 15) is " + result);
    }
}
