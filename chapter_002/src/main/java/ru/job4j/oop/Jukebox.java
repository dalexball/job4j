package ru.job4j.oop;

/**
 * Class models jukebox
 *
 * @author Alex Dotsyak
 * @version 1
 */
public class Jukebox {

    /**
     * Plays different music depending on input
     * @param position - point at which is certain music
     */
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox marshal59 = new Jukebox();
        marshal59.music(1);
        marshal59.music(2);
        marshal59.music(34);
    }
}
