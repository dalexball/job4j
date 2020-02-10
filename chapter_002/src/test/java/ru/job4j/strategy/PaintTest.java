package ru.job4j.strategy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.StringJoiner;

/**
 * @author Alex Dotsyak
 * @version 0.1
 * @since 0.1
 */
public class PaintTest {
    // поле содержит дефолтный вывод в консоль.
    private final PrintStream stdout = System.out;
    // буфер для результата.
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }


    /**
     * Tests if paint class works fine when draws square
     */
    @Test
    public void whenDrawSquare() {
        // выполняем действия пишушиее в консоль.
        new Paint().draw(new Square());
        // проверяем результат вычисления
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringJoiner(
                                System.lineSeparator(), "",
                                System.lineSeparator())
                                .add("XXXX")
                                .add("X  X")
                                .add("X  X")
                                .add("XXXX")
                                .toString()
                )
        );
    }

    /***
     * Tests if paint class works fine when draws triangle
     */
    @Test
    public void whenDrawTriangle() {
        new Paint().draw(new Triangle());
        assertThat(
                out.toString(),
                is(
                        new StringJoiner(
                                System.lineSeparator(), "",
                                System.lineSeparator())
                                .add("  X  ")
                                .add(" X X ")
                                .add("XXXXX")
                                .toString()
                )
        );
    }

}
