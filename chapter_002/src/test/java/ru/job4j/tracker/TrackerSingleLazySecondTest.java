package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test class for TrackerSingleLazySecond class
 *
 * @author Alex Dotsyak
 * @version 1
 * @since 0.1
 */
public class TrackerSingleLazySecondTest {

    /**
     * Checks if receivers get same instance of class
     */
    @Test
    public void whenSame() {
        TrackerSingleLazySecond tsf = TrackerSingleLazySecond.getInstance();
        TrackerSingleLazySecond tss = TrackerSingleLazySecond.getInstance();
        assertEquals(tsf, tss);
    }
}
