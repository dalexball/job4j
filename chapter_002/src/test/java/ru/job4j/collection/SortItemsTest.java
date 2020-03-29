package ru.job4j.collection;

import org.junit.Test;
import ru.job4j.tracker.Item;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

/**
 * Test class for SortItems class
 *
 * @author Alex Dotsyak
 * @version 1
 * @since 0.1
 */
public class SortItemsTest {

    /**
     * Checks if sorts fine when sort by increasing values
     */
    @Test
    public void whenSortInc() {
        Item item1 = new Item("A");
        Item item2 = new Item("X");
        Item item3 = new Item("G");
        List<Item> items = new ArrayList<>(List.of(item1, item2, item3));
        items.sort(new SortItems());
        assertEquals(items, List.of(item1, item3, item2));
    }

    /**
     * Checks if sorts fine when sort by decreasing values
     */
    @Test
    public void whenSortDec() {
        Item item1 = new Item("A");
        Item item2 = new Item("X");
        Item item3 = new Item("G");
        List<Item> items = new ArrayList<>(List.of(item1, item2, item3));
        items.sort(new SortItems().reversed());
        assertEquals(items, asList(item2, item3, item1));
    }
}
