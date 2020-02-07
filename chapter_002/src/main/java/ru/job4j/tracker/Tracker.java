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
        items[this.position] = item;
        this.position++;
        return item;
    }

    /**
     * Method returns array of not-null items
     *
     * @return array
     */
    public Item[] findAll() {
        Item[] items = new Item[this.items.length];
        items = Arrays.copyOf(this.items, this.items.length);
        int size = 0;
        for (int index = 0; index < items.length; index++) {
            if (items[index] != null) {
                items[size] = items[index];
                size++;
            }
        }
        Item[] newItems;
        newItems = Arrays.copyOf(items, size);
        return newItems;
    }

    /**
     * Method makes array of items with specific name
     *
     * @param key - specific name
     * @return array of items with specific name
     */
    public Item[] findByName(String key) {
        Item[] items = new Item[this.items.length];
        items = Arrays.copyOf(this.items, this.items.length);
        int size = 0;
        for (int index = 0; index < items.length; index++) {
            if (items[index] != null) {
                String name = items[index].getName();
                if (name.equals(key)) {
                    items[size] = items[index];
                    size++;
                }
            }
        }
        items = Arrays.copyOf(items, size + 1);
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
            if (items[i] != null && items[i].getId().equals(id)) {
                return items[i];
            }
        }
        return null;
    }

    /**
     * Gets index of item in array
     *
     * @param id - id of item
     * @return - index of item
     */
    private int findPosition(String id) {
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i].getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Replaces element in array with null (deletes item from array)
     *
     * @param id - id of element
     */
    public void deleteById(String id) {
        int index = findPosition(id);
        if (index >= 0) {
            items[index] = null;
        } else {
            System.out.println("There is no element with such ID");
        }
    }
}
