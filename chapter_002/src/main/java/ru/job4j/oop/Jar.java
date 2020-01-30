package ru.job4j.oop;

/**
 * Class models jar with water
 *
 * @author Alex Dotsyak
 * @version 1
 */
public class Jar {

    /**
     * amount of water inside the jar
     */
    private double value;

    /**
     * Pours water from another jar into this jar
     * @param another - another jar
     * @param amount - amount that has to be poured
     */
    public void pourInto(Jar another, double amount) {
        this.value += amount;
        another.value -= amount;
    }

    /**
     * Pours water from this jar into another jar
     * @param another - another jar
     * @param amount - amount that has to be poured
     */
    public void pourAway(Jar another, double amount) {
        this.value -= amount;
        another.value += amount;
    }

    /**
     * Makes amount of water in different jars same, by pouring water
     * from one that has more water into another
     * @param another - another jar
     */
    public void pourEqual(Jar another) {
        double shouldBe = (another.value + this.value) / 2;
        double amount;
        if (another.value > this.value) {
            amount = shouldBe - this.value;
            pourInto(another, amount);
        } else {
            amount = shouldBe - another.value;
            pourAway(another, amount);
        }
    }

    /**
     * Defines jar
     * @param size - amount of water, that is at the start inside the jar
     */
    public Jar(double size) {
        this.value = size;
    }

    /**
     * Shows how much water is in the jar
     */
    public void getValue() {
        System.out.println(this.value);
    }

    public static void main(String[] args) {
        Jar jar1 = new Jar(12);
        Jar jar2 = new Jar(6);
        jar1.getValue();
        jar2.getValue();
        jar1.pourEqual(jar2);
        jar1.getValue();
        jar2.getValue();
    }
}
