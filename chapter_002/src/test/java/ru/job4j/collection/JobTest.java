package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Test class for Job comparing
 *
 * @author Alex Dotsyak
 * @version 1
 * @since 0.1
 */
public class JobTest {

    /**
     * Two following tests check if JobDescByName and reversed version work fine
     */

    @Test
    public void whenCompareByNameInc() {
        Comparator<Job> comparator = new JobDescByName();
        int rsl = comparator.compare(
                new Job("task 1", 0),
                new Job("task 2", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompareByNameDec() {
        Comparator<Job> comparator = new JobDescByName().reversed();
        int rsl = comparator.compare(
                new Job("task 1", 0),
                new Job("task 2", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    /**
     * Two following tests check if JobDescByPriority and reversed version work fine
     */

    @Test
    public void whenCompareByPriorityInc() {
        Comparator<Job> comparator = new JobDescByPriority();
        int rsl = comparator.compare(
                new Job("task 1", 0),
                new Job("task 2", 4)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompareByPriorityDec() {
        Comparator<Job> comparator = new JobDescByPriority().reversed();
        int rsl = comparator.compare(
                new Job("task 1", 0),
                new Job("task 2", 4)
        );
        assertThat(rsl, lessThan(0));
    }

    /**
     * Checks if combined comparator sorts jobs in right order
     */
    @Test
    public void whenCompareByNameAndThenPriority() {
        Comparator<Job> comparator = new JobDescByName().thenComparing(new JobDescByPriority());
        Job job1 = new Job("Engineer", 0);
        Job job2 = new Job("Engineer", 1);
        Job job3 = new Job("Dantist", 3);
        List<Job> jobs = new ArrayList<>(List.of(job1, job2, job3));
        jobs.sort(comparator);
        assertEquals(jobs, List.of(job2, job1, job3));
    }
}