package ru.job4j.collection;

import ru.job4j.tracker.Item;

import java.util.Collections;
import java.util.Comparator;

/**
 * Comparator class for Item class
 *
 * @author Alex Dotsyak
 * @version 1
 * @since 0.1
 */
public class SortItems implements Comparator<Item> {

    /**
     * Compares by name, if names are equal, compare IDs
     *
     * @param o1 - Item 1
     * @param o2 - Item 2
     * @return 0 if o1 = o2, >0 if o1 > o2, <0 if o1 < o2
     */
    @Override
    public int compare(Item o1, Item o2) {

        int value;

        value = o1.getName().compareTo(o2.getName());

        if (value == 0) {
            value = o1.getId().compareTo(o2.getId());
        }

        return value;

    }

    /**
     * Reversed comparator
     *
     * @return 0 if o1 = o2, >0 if o1 < o2, <0 if o1 > o2
     */
    @Override
    public Comparator<Item> reversed() {
        return Collections.reverseOrder(this);
    }

}
