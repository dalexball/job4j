package ru.job4j.tracker;

import java.util.List;

/**
 * Finds items with same name, shows information about them
 *
 * @author Alex Dotsyak
 * @version 1
 */
public class FindByName implements UserAction {

    @Override
    public String name() {
        return "Find Item by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("===Find Items by name===");
        String name = input.askString("Enter name: ");
        List<Item> items;
        items = tracker.findByName(name);
        for (Item item : items) {
            if (item != null) {
                System.out.format("Item name: %1s, item id: %2s.%n", item.getName(), item.getId());
            } else {
                System.out.println("No items with such name");
            }
        }
        return true;
    }
}

