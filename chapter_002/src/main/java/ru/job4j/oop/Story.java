package ru.job4j.oop;

/**
 * Class models tale about red little riding hood
 */
public class Story {
    public static void main(String[] args) {
        Pioneer petya = new Pioneer();
        Girl girl = new Girl();
        Wolf wolf = new Wolf();

        girl.help(petya);
        wolf.eat(girl);
        petya.kill(wolf);
    }
}
