package ru.job4j.tracker;

/**
 * Finds item with specific ID
 *
 * @author Alex Dotsyak
 * @version 1
 */
public class FindItem implements UserAction {
    @Override
    public String name() {
        return "Find Item by ID";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("===Find Item by ID===");
        String id = input.askString("Enter ID: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.format("Item name: %1s, item id: %2s.%n", item.getName(), item.getId());
        }
        return true;
    }
}
