package ru.job4j.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Class models student who has certain score
 *
 * @author Alex Dotsyak
 * @version 1
 * @since 1
 */
public class Student {

    /**
     * Sets students score to certain number if it fits 0 >= score <= 100
     * else sets score absolute value of division remainder to 101
     *
     * @param score - score
     */
    public Student(int score) {
        if (score >= 0 && score <= 100) {
            this.score = score;
        } else {
            this.score = Math.abs(score % 101);
        }
    }

    /**
     * Students score, name and surname
     */
    private int score;
    private String surname;
    private String name;

    public int getScore() {
        return score;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    Map<String, Student> map(List<Student> students) {
        return students.stream()
                .collect(Collectors.toMap(Student::getSurname, s -> s));
    }
}
