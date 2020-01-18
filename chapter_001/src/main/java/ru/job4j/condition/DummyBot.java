package ru.job4j.condition;

public class DummyBot {

    public static String answer(String question) {
        String rsl = "I don't ponimay question. Pojalysta ask again.";
        if ("Darova, Bot.".equals(question)) {
            // заменить ... на правильный ответ rsl = "ответ по заданию".
            rsl = "Darova, Umnik.";
        } else if ("BB, botyara".equals(question)) { // заменить ... на проверку, известен ли боту этот вопрос и он знает как на него ответить.
            // заменить ... на правильный ответ rsl = "ответ по заданию".
            rsl = "See ya later, lox.";
        }
        return rsl;
    }
}
