package ru.job4j.tracker;

/**
 * Class is made to be used in testing, uses tracker.findByName method
 */
public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "Find by name action";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        for (Item item : tracker.findByName(input.askString(""))) {
            System.out.println(String.format("%s %s", item.getName(), item.getId()));
        }
        return true;
    }
}
