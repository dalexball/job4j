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

    private int z;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.z = 0;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
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

    /**
     * Calculates distance between two points in 3D
     *
     * @param another - another point
     * @return distance between points
     */
    public double distance3D(Point another) {
        return (Math.sqrt(
                          Math.pow((this.x - another.x), 2)
                        + Math.pow((this.y - another.y), 2)
                        + Math.pow((this.z - another.z), 2)
        )
        );
    }

    /**
     * Calculates distance between two points in 3D
     *
     * @param first  - first point
     * @param second - second point
     * @return distance between points
     */
    public static double distance3D(Point first, Point second) {
        return (Math.sqrt(
                          Math.pow((first.x - second.x), 2)
                        + Math.pow((first.y - second.y), 2)
                        + Math.pow((first.z - second.z), 2)
                )
        );
    }

}
