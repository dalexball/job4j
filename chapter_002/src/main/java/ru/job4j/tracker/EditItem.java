package ru.job4j.tracker;

/**
 * Edits name of item with specific ID
 *
 * @author Alex Dotsyak
 * @version 1
 */
public class EditItem implements UserAction {

    @Override
    public String name() {
        return "Edit Item by ID";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("===Edit Item by ID===");
        String id = input.askString("Enter ID: ");
        Item item;
        item = tracker.findById(id);
        String name = input.askString("Enter new name: ");
        item.setName(name);

        return true;
    }
}
