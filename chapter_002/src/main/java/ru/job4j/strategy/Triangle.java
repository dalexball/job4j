package ru.job4j.strategy;

import java.util.StringJoiner;

/**
 * Triangle figure
 *
 * @author Alex Dotsyak
 * @version 0.1
 * @since 0.1
 */
public class Triangle implements Shape {

    @Override
    public String draw() {
        StringJoiner pic = new StringJoiner(System.lineSeparator());
        pic.add("  X  ")
                .add(" X X ")
                .add("XXXXX");
        System.out.print("");
        return pic.toString();
    }
}
