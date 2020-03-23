package ru.job4j.streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Class models school that filters students by certain predicates
 *
 * @author Alex Dotsyak
 * @version 1
 * @since 1
 */
public class School {

    /**
     * Collect students with specific score from all students
     *
     * @param students  - students
     * @param predicate - predicate
     * @return list of filtered students
     */
    public List<Student> collect(List<Student> students, Predicate<Student> predicate) {
        return students.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

}
