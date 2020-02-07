package ru.job4j.tracker;

import org.junit.Test;

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

}
