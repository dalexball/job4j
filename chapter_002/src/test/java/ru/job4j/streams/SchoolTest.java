package ru.job4j.streams;

import org.junit.Test;

import java.util.List;
import java.util.function.Predicate;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

/**
 * Test class for School class
 *
 * @author Alex Dotsyak
 * @version 1
 * @since 1
 */
public class SchoolTest {

    /**
     * If students score is greater than 70 then move them to class A
     */
    @Test
    public void when70To100ThenA() {
        Student a = new Student(40);
        Student b = new Student(70);
        Student c = new Student(101);
        Student d = new Student(100);
        Student e = new Student(86);
        Predicate<Student> predicate = s -> s.getScore() >= 70 && s.getScore() <= 100;
        List<Student> expected = List.of(b, d, e);
        List<Student> students = List.of(a, b, c, d, e);
        List<Student> result = new School().collect(students, predicate);
        assertThat(result, equalTo(expected));
    }

    /**
     * If students score is greater than 49 and lower than 70 then move them to class B
     */
    @Test
    public void when50To69ThenB() {
        Student a = new Student(40);
        Student b = new Student(70);
        Student c = new Student(101);
        Student d = new Student(58);
        Student e = new Student(69);
        Predicate<Student> predicate = s -> s.getScore() >= 50 && s.getScore() < 70;
        List<Student> expected = List.of(d, e);
        List<Student> students = List.of(a, b, c, d, e);
        List<Student> result = new School().collect(students, predicate);
        assertThat(result, equalTo(expected));
    }

    /**
     * If students score is greater than 0 and lower than 50 then move them to class C
     */
    @Test
    public void when1To49ThenB() {
        Student a = new Student(49);
        Student b = new Student(50);
        Student c = new Student(102);
        Student d = new Student(0);
        Student e = new Student(140);
        Predicate<Student> predicate = s -> s.getScore() > 0 && s.getScore() < 50;
        List<Student> expected = List.of(a, c, e);
        List<Student> students = List.of(a, b, c, d, e);
        List<Student> result = new School().collect(students, predicate);
        assertThat(result, equalTo(expected));
    }

}
