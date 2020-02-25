package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
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
    private List<Item> items = new ArrayList<>();

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
        items.add(item);
        return item;
    }

    /**
     * Method returns array of not-null items
     *
     * @return array
     */
    public List<Item> findAll() {
        return items;
    }

    /**
     * Method makes array of items with specific name
     *
     * @param key - specific name
     * @return array of items with specific name
     */
    public List<Item> findByName(String key) {
        List<Item> items = new ArrayList<>();
        for (Item item : this.items) {
            if (item.getName().equals(key)) {
                items.add(item);
            }
        }
        return items;
    }

    /**
     * Method finds item with specific id
     *
     * @param id - id
     * @return item with specific id
     */
    public Item findById(String id) {
        for (Item item : items) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }

    /**
     * Replaces element in array with null (deletes item from array)
     *
     * @param id - id of element
     */
    public void deleteById(String id) {
        for (Item item : items) {
            if (item.getId().equals(id)) {
                items.remove(item);
                return;
            }
            System.out.println("There is no element with such ID");
        }
    }
}
