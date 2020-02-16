package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test class for TrackerSingleLazyFirst class
 *
 * @author Alex Dotsyak
 * @version 1
 * @since 0.1
 */
public class TrackerSingleLazyFirstTest {

    /**
     * Checks if receivers get same instance of class
     */
    @Test
    public void whenSame() {
        TrackerSingleLazyFirst tsf = TrackerSingleLazyFirst.getInstance();
        TrackerSingleLazyFirst tss = TrackerSingleLazyFirst.getInstance();
        assertEquals(tss, tsf);
    }
}
