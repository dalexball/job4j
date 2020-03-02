package ru.job4j.collection;

/**
 * Class models job
 *
 * @author Alex Dotsyak
 * @version 1
 * @since 0.1
 */
public class Job implements Comparable<Job> {

    /**
     * Name and priority of the job
     */
    private String name;
    private int priority;

    public Job(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Job{" + name + ", " + priority + '}';
    }

    @Override
    public int compareTo(Job another) {
        return Integer.compare(priority, another.priority);
    }
}
