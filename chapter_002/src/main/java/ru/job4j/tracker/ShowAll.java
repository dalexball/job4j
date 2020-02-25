package ru.job4j.tracker;

import java.util.List;

/**
 * Shows all items within array
 */
public class ShowAll implements UserAction {
    @Override
    public String name() {
        return "Show all Items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("===Show all Items===");
        List<Item> items;
        items = tracker.findAll();
        for (Item item : items) {
            if (item != null) {
                System.out.format("Item name: %1s, item id: %2s.%n", item.getName(), item.getId());
            }
        }
        return true;
    }
}
