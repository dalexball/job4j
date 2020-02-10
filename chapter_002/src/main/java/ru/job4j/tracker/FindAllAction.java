package ru.job4j.tracker;

/**
 * Class is made to be used in testing, uses tracker.findAll method
 */
public class FindAllAction implements UserAction {
    @Override
    public String name() {
        return "Find all.";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        for (Item item : tracker.findAll()) {
            System.out.println(String.format("%s %s", item.getName(), item.getId()));
        }
        return true;
    }
}
