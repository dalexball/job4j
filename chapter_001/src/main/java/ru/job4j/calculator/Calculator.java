package ru.job4j.calculator;

public class Calculator {
    public static void add(double firstVal, double secondVal) {
        double result = firstVal + secondVal;
        System.out.println(firstVal + "+" + secondVal + "=" + result);
    }

    public static void subtract(double firstVal, double secondVal) {
        double result = firstVal - secondVal;
        System.out.println(firstVal + "-" + secondVal + "=" + result);
    }

    public static void multiply(double firstVal, double secondVal) {
        double result = firstVal * secondVal;
        System.out.println(firstVal + "*" + secondVal + "=" + result);
    }

    public static void div(double firstVal, double secondVal) {
        double result = firstVal / secondVal;
        System.out.println(firstVal + "/" + secondVal + "=" + result);
    }

    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiply(2, 1);
        subtract(10, 5);
    }
}
