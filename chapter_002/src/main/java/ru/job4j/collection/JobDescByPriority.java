package ru.job4j.collection;

import java.util.Collections;
import java.util.Comparator;

/**
 * Compares jobs by priority
 *
 * @author Alex Dotsyak
 * @version 1
 * @since 0.1
 */
public class JobDescByPriority implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return Integer.compare(o2.getPriority(), o1.getPriority());
    }

    @Override
    public Comparator<Job> reversed() {
        return Collections.reverseOrder(this);
    }
}
