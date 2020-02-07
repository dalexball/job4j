package ru.job4j.tracker;

/**
 * Deletes item with specific ID
 *
 * @author Alex Dotsyak
 * @version 1
 */
public class DeleteItem implements UserAction {
    @Override
    public String name() {
        return "Delete Item by ID";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("===Delete Item by ID===");
        String id = input.askString("Enter ID: ");
        tracker.deleteById(id);
        return true;
    }
}
