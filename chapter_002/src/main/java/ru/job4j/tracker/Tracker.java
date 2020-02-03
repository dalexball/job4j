package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * Tracker class
 *
 * @author Alex Dotsyak
 * @version 1
 */
public class Tracker {
    /**
     * Array for items
     */
    private Item[] items = new Item[100];

    /**
     * Index for new item
     */
    private int position = 0;

    /**
     * Method generates unique key for each item
     * Because of the fact that fields, description and names are not unique, it is necessary to use unique id
     *
     * @return unique id
     */
    private String generateId() {
        Random random = new Random();
        return String.valueOf(random.nextLong() + System.currentTimeMillis());
    }


    /**
     * Method adds item to array
     *
     * @param item - item to add
     * @return added item
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        items[this.position++] = item;
        return item;

    }

    /**
     * Method returns array of not-null items
     *
     * @return array
     */
    public Item[] findAll() {
        Item[] items = new Item[this.items.length];
        int size = 0;
        for (int index = 0; index < items.length; index++) {
            String name = items[index].getName();
            if (name != null) {
                items[size] = items[index];
                size++;
            }
        }
        items = Arrays.copyOf(items, size);
        return items;
    }

    /**
     * Method makes array of items with specific name
     *
     * @param key - specific name
     * @return array of items with specific name
     */
    public Item[] findByName(String key) {
        Item[] items = new Item[this.items.length];
        int size = 0;
        for (int index = 0; index < items.length; index++) {
            String name = items[index].getName();
            if (name.equals(key)) {
                items[size] = items[index];
                size++;
            }
        }
        items = Arrays.copyOf(items, size);
        return items;
    }

    /**
     * Method finds item with specific id
     *
     * @param id - id
     * @return item with specific id
     */
    public Item findById(String id) {
        for (int i = 0; i != position + 1; i++) {
            if (items[i].getId().equals(id)) {
                return items[i];
            }
        }
        return null;
    }
}
