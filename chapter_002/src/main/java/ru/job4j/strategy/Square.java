package ru.job4j.strategy;

import java.util.StringJoiner;

/**
 * Square figure
 *
 * @author Alex Dotsyak
 * @version 0.1
 * @since 0.1
 */
public class Square implements Shape {

    @Override
    public String draw() {
        StringJoiner pic = new StringJoiner(System.lineSeparator());
        pic.add("XXXX")
                .add("X  X")
                .add("X  X")
                .add("XXXX");
        return pic.toString();
    }
}
