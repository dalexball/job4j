package ru.job4j.calculator;

/**
 * This class contains operations between two variables of type double.
 *
 * @author Alex Dotsyak
 * @version 1
 */
public class Calculator {
    /**
     * Prints result of adding of two vars.
     *
     * @param firstVal-firstVal
     * @param secondVal-secondVal
     */
    public static void add(double firstVal, double secondVal) {
        double result = firstVal + secondVal;
        System.out.println(firstVal + "+" + secondVal + "=" + result);
    }

    /**
     * Prints result of subtracting between two vars.
     *
     * @param firstVal-firstVal
     * @param secondVal-secondVal
     */
    public static void subtract(double firstVal, double secondVal) {
        double result = firstVal - secondVal;
        System.out.println(firstVal + "-" + secondVal + "=" + result);
    }

    /**
     * Prints result of multiplying of two vars.
     *
     * @param firstVal-firstVal
     * @param secondVal-secondVal
     */
    public static void multiply(double firstVal, double secondVal) {
        double result = firstVal * secondVal;
        System.out.println(firstVal + "*" + secondVal + "=" + result);
    }

    /**
     * Prints result of dividing between two vars.
     *
     * @param firstVal-firstVal
     * @param secondVal-secondVal
     */
    public static void div(double firstVal, double secondVal) {
        double result = firstVal / secondVal;
        System.out.println(firstVal + "/" + secondVal + "=" + result);
    }

    /**
     * Calculates some vars.
     *
     * @param args-args
     */
    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiply(2, 1);
        subtract(10, 5);
    }
}
