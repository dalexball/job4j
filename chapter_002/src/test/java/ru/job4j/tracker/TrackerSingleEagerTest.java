package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test class for TrackerSingleEager class
 *
 * @author Alex Dotsyak
 * @version 1
 * @since 0.1
 */
public class TrackerSingleEagerTest {

    /**
     * Checks if receivers get same instance of class
     */
    @Test
    public void whenSame() {
        TrackerSingleEager tsf = TrackerSingleEager.getInstance();
        TrackerSingleEager tss = TrackerSingleEager.getInstance();
        assertEquals(tsf, tss);
    }
}
