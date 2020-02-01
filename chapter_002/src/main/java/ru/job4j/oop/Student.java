package ru.job4j.oop;

/**
 * Class models student in music school
 *
 * @author Alex Dotsyak
 * @version 1
 */
public class Student {

    /**
     * Gives information about which song can student sing
     *
     * @param lyrics - lyrics of the song
     */
    public void music(String lyrics) {
        System.out.println("I can sing a song: " + lyrics);
    }

    /**
     * Student sings song
     */
    public void song() {
        System.out.println("I believe I can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        String song = "I believe I can fly";
        petya.music(song);
    }
}
