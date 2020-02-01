package ru.job4j.oop;

/**
 * Class models tale about ball
 *
 * @author Alex Dotsyak
 * @version 1
 */
public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Wolf wolf = new Wolf();
        Hare hare = new Hare();
        Fox fox = new Fox();
        ball.runAway();
        hare.tryEat(ball);
        wolf.tryEat(ball);
        fox.tryEat(ball);
    }
}
