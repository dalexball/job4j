package ru.job4j.tracker;

import java.util.Scanner;

/**
 * Input class that works with console
 *
 * @author Alex Dotsyak
 * @version 1
 */
public class ConsoleInput implements Input {


    Scanner scanner = new Scanner(System.in);

    @Override
    public int askInt(String question) {
        int res;
        res = Integer.parseInt(scanner.nextLine());
        return res;
    }

    @Override
    public String askString(String question) {
        System.out.println(question);
        String res;
        res = scanner.nextLine();
        return res;
    }


    @Override
    public int askInt(String question, int max) {
        int select = askInt(question);
        if (select < 0 || select >= max) {
            throw new IllegalStateException(String.format("Out of about %s > [0, %s]", select, max));
        }
        return select;
    }
}
