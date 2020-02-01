package ru.job4j.calculator;

/**
 * This class contains operations between two variables of type double.
 *
 * @author Alex Dotsyak
 * @version 1
 */
public class Calculator {
    /**
     * Calculates result of adding of two vars.
     *
     * @param firstVal-firstVal
     * @param secondVal-secondVal
     * @return result of adding of two vars
     */
    public static double add(double firstVal, double secondVal) {
        double result = firstVal + secondVal;
        return result;
    }

    /**
     * Calculates result of adding of three values
     *
     * @param firstVal  - firstVal
     * @param secondVal - secondVal
     * @param thirdVal  - thirdVal
     * @return result
     */
    public static double add(double firstVal, double secondVal, double thirdVal) {
        double result = add(firstVal, add(secondVal, thirdVal));
        return result;
    }

    /**
     * Calculates result of subtracting between two vars.
     *
     * @param firstVal-firstVal
     * @param secondVal-secondVal
     * @return result
     */
    public static double subtract(double firstVal, double secondVal) {
        double result = firstVal - secondVal;
        return result;
    }

    /**
     * Prints result of multiplying of two vars.
     *
     * @param firstVal-firstVal
     * @param secondVal-secondVal
     * @return result
     */
    public static double multiply(double firstVal, double secondVal) {
        double result = firstVal * secondVal;
        return result;
    }

    /**
     * Prints result of dividing between two vars.
     *
     * @param firstVal-firstVal
     * @param secondVal-secondVal
     * @return result
     */
    public static double div(double firstVal, double secondVal) {
        double result = firstVal / secondVal;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(add(1, 1));
        System.out.println(div(4, 2));
        System.out.println(multiply(2, 1));
        System.out.println(subtract(10, 5));
    }
}
