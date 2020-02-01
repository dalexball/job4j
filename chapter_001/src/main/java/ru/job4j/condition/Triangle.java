package ru.job4j.condition;

/**
 * Class models triangle
 *
 * @author Alex Dotsyak
 * @version 3
 */
public class Triangle {

    private Point first;
    private Point second;
    private Point third;

    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangle(Point first, Point second, Point third) {
        this.first = first;
        this.second = second;
        this.third = third;
        firstSide = Point.distance(this.first, this.second);
        secondSide = Point.distance(this.first, this.third);
        thirdSide = Point.distance(this.second, this.third);
    }

    /**
     * Checks if triangle exists
     *
     * @return true, if triangle exists, false if doesn't
     */
    public boolean exists() {
        boolean result = false;
        if ((firstSide + secondSide) > thirdSide) {
            if ((firstSide + secondSide) > secondSide) {
                if ((secondSide + thirdSide) > firstSide) {
                    result = true;
                }
            }
        }
        return result;
    }

    /**
     * Checks if triangle exists
     *
     * @param first  - first side
     * @param second - second side
     * @param third  - third side
     * @return true, if triangle with these sides can exist, false if can't
     */
    public static boolean exists(double first, double second, double third) {
        boolean result = false;
        if ((first + second) > third) {
            if ((first + third) > second) {
                if ((second + third) > first) {
                    result = true;
                }
            }
        }
        return result;
    }

    /**
     * Calculates area of triangle
     *
     * @return area of triangle
     */
    public double area() {
        double halfPerimeter = (firstSide + thirdSide + secondSide) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - secondSide) * (halfPerimeter - firstSide) * (halfPerimeter - thirdSide));
    }

    /**
     * Calculates area of triangle
     *
     * @param first  - first side
     * @param second - second side
     * @param third  - third side
     * @return area of triangle
     */
    public static double area(double first, double second, double third) {
        double halfPerimeter = (first + second + third) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - second) * (halfPerimeter - first) * (halfPerimeter - third));
    }
}
