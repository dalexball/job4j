package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Test class for Tracker class
 *
 * @author Alex Dotsyak
 * @version 1
 */
public class TrackerTest {
    /**
     * Checks if tracker has same item, as added to it
     */
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    /**
     * Checks if StartUI works as it is needed
     */
    @Test
    public void whenExit() {
        StubInput input = new StubInput(new String[]{"0"});
        StubAction action = new StubAction();
        new StartUI().init(input, new Tracker(), new UserAction[]{action});
        assertThat(action.isCall(), is(true));
    }

    /**
     * Checks if menu is printed when StartUI class init method is used
     */
    @Test
    public void whenPrtMenu() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        StubInput input = new StubInput(
                new String[]{"0"}
        );
        StubAction action = new StubAction();
        new StartUI().init(input, new Tracker(), new UserAction[]{action});
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("Menu.")
                .add("0. Stub action")
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);
    }

    /**
     * Checks if output of findAll works fine
     */
    @Test
    public void whenFindAll() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        Tracker tracker = new Tracker();
        Item item = new Item("fix bug");
        tracker.add(item);
        FindAllAction action = new FindAllAction();
        action.execute(new StubInput(new String[]{}), tracker);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add(String.format("%s %s", item.getName(), item.getId()))
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);
    }

    /**
     * Checks if output of findByName works fine
     */
    @Test
    public void whenFindByNameAction() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        Tracker tracker = new Tracker();
        String key = "key_name";
        Item item = new Item("key_name");
        tracker.add(item);
        FindByNameAction action = new FindByNameAction();
        action.execute(new StubInput(new String[]{"0"}), tracker);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add(String.format("%s %s", item.getName(), item.getId()))
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);
    }
}
