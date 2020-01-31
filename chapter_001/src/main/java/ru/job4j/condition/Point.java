package ru.job4j.condition;

/**
 * Class models point
 *
 * @author Alex Dotsyak
 * @version 2
 */
public class Point {

    private int x;

    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Calculates distance between this point to another
     *
     * @param another - another point
     * @return distance between points
     */
    public double distance(Point another) {
        return (Math.sqrt(Math.pow((this.x - another.x), 2) + Math.pow((this.y - another.y), 2)));
    }

    /**
     * Calculates distance between two points
     *
     * @param first  - first point
     * @param second - second point
     * @return distance between points
     */
    public static double distance(Point first, Point second) {
        return (Math.sqrt(Math.pow((first.x - second.x), 2) + Math.pow((first.y - second.y), 2)));
    }

}
