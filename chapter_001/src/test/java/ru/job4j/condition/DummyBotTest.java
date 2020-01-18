package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DummyBotTest {
    @Test
    public void whenZdarova() {
        assertThat(
                DummyBot.answer("Darova, Bot."),
                is("Darova, Umnik.")
        );
    }

    @Test
    public void whenBbak() {
        assertThat(
                DummyBot.answer("BB, botyara."),
                is("See ya later, lox.")
        );
    }

    @Test
    public void whenNeponyatno() {
        assertThat(
                DummyBot.answer("Ti 4itatb ymeew?"),
                is("I don't ponimay question. Pojalysta ask again.")
        );
    }

}
