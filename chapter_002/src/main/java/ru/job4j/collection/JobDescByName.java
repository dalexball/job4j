package ru.job4j.collection;

import java.util.Collections;
import java.util.Comparator;

/**
 * Compares jobs by name
 *
 * @author Alex Dotsyak
 * @version 1
 * @since 0.1
 */
public class JobDescByName implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return o2.getName().compareTo(o1.getName());
    }

    public Comparator<Job> reversed() {
        return Collections.reverseOrder(this);
    }
}
