package ru.job4j.tracker;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test class for TrackerSingleEnum class
 *
 * @author Alex Dotsyak
 * @version 1
 * @since 0.1
 */
public class TrackerSingleEnumTest {

    /**
     * Checks if receivers get same instance of class
     */
    @Test
    public void whenSame() {
        TrackerSingleEnum tsf = TrackerSingleEnum.getInstance();
        TrackerSingleEnum tss = TrackerSingleEnum.getInstance();
        assertEquals(tsf, tss);
    }
}
