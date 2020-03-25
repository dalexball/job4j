package ru.job4j.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MatrixToList {
    public List<Integer> matrixToList() {

        Integer[][] ints = new Integer[][]{
                {1, 2},
                {3, 4}
        };

        return Stream.of(ints)
                .collect(Collectors.toList())
                .stream()
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
    }
}
