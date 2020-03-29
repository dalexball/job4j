package ru.job4j.streams2;

import ru.job4j.tracker.StubInput;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student implements Comparable<Student> {
    @Override
    public int compareTo(Student o) {
        return this.scope - o.scope;
    }

    public Student(String name, int scope) {
        this.name = name;
        this.scope = scope;
    }

    private String name;
    private int scope;

    public String getName() {
        return name;
    }

    public int getScope() {
        return scope;
    }

    public List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .sorted()
                .flatMap(Stream::ofNullable)
                .takeWhile(s -> s.scope > bound)
                .collect(Collectors.toList());
    }
}
