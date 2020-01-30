package ru.job4j.oop;

/**
 * Class models battery with load
 *
 * @author Alex Dotsyak
 * @version 1
 */
public class Battery {

    /**
     * Shows how much load is in battery
     */
    private int load;

    /**
     * Takes away load of this battery and moves it to another
     * @param another - another battery
     */
    public void exchange(Battery another){
        another.load+=this.load;
        this.load=0;
    }

}
