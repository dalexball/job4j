package ru.job4j.tracker;

/**
 * Item class
 *
 * @author Alex Dotsyak
 * @version 1
 */
public class Item {
    /**
     * Id of item
     */
    private String id;

    /**
     * Name of item
     */
    private String name;

    /**
     * Initiates Item with name
     *
     * @param name - name
     */
    public Item(String name) {
        this.name = name;
    }

    /**
     * Gets id of item
     *
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets id of item
     *
     * @param id -id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets name of item
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name of item
     *
     * @param name - name
     */
    public void setName(String name) {
        this.name = name;
    }

}
