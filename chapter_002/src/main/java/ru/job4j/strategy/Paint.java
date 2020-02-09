package ru.job4j.strategy;

/**
 * Class outputs figures by using instances of Shape interface
 *
 * @author Alex Dotsyak
 * @version 0.1
 * @since 0.1
 */
public class Paint {
    /**
     * Outputs shape.draw() to console
     *
     * @param shape - shape
     */
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }

    public static void main(String[] args) {
        Shape triangle = new Triangle();
        Paint paint = new Paint();
        paint.draw(triangle);
    }
}
