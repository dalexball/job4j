package ru.job4j.oop;

/**
 * Class models cat
 *
 * @author Alex Dotsyak
 * @version 2
 */
public class Cat {

    private String food;

    private String name;

    /**
     * Gives nickname
     *
     * @param nick - cats name
     */
    public void giveNick(String nick) {
        this.name = nick;
    }

    /**
     * Initializes food
     *
     * @param meat - meat for cat
     */
    public void eat(String meat) {
        this.food = meat;
    }

    /**
     * Gives information about cat
     */
    public void show() {
        System.out.println(this.name);
        System.out.println(this.food);
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("Gav");
        gav.show();
        System.out.println("There are black's food");
        Cat black = new Cat();
        black.giveNick("Black");
        black.eat("fish");
        black.show();
    }
}
