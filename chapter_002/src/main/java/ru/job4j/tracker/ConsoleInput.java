package ru.job4j.tracker;

import java.util.Scanner;

/**
 * Input class that works with console
 *
 * @author Alex Dotsyak
 * @version 1
 */
public class ConsoleInput implements Input {
    @Override
    public int askInt(String question) {
        Scanner scanner = new Scanner(System.in);
        int res;
        res = Integer.parseInt(scanner.nextLine());
        return res;
    }

    @Override
    public String askString(String question) {
        System.out.println(question);
        Scanner scanner = new Scanner(System.in);
        String res;
        res = scanner.nextLine();
        return res;
    }

}
