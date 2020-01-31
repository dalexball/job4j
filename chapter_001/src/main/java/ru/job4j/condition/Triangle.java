package ru.job4j.condition;

/**
 * Class models triangle
 *
 * @author Alex Dotsyak
 * @version 2
 */
public class Triangle {

    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point first, Point second, Point third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    /**
     * Checks if triangle exists
     * ab,bc,ac - triangle sides
     *
     * @return true, if triangle exists, false if doesn't
     */
    public boolean exists() {
        boolean result = false;
        double ab = Point.distance(first, second);
        double ac = Point.distance(first, third);
        double bc = Point.distance(second, third);
        if ((ab + ac) > bc) {
            if ((ab + bc) > ac) {
                if ((ac + bc) > ab) {
                    result = true;
                }
            }
        }
        return result;
    }

    public static boolean exists(double first, double second, double third){
        boolean result=false;
        if ((first + second) > third) {
            if ((first + third) > second) {
                if ((second + third) > first) {
                    result = true;
                }
            }
        }
        return result;
    }
}
