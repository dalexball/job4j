package ru.job4j.tracker;

/**
 * Creates item with given name
 *
 * @author Alex Dotsyak
 * @version 1
 */
public class CreateItem implements UserAction {
    @Override
    public String name() {
        return "Create Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("===Create a new Item ===");
        String name = input.askString("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);

        return true;
    }
}
