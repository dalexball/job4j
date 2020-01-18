package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        in = 180;
        expected = 3;
        out = rubleToDollar(in);
        passed = expected == out;
        System.out.println("180 rubles are 3 dollars. Test result : " + passed);
        in = 5;
        expected = 350;
        out = euroToRuble(in);
        passed = expected == out;
        System.out.println("5 euro are 350 rubles. Test result : " + passed);
        in = 6;
        expected = 360;
        out = dollarToRuble(in);
        passed = expected == out;
        System.out.println("6 dollars are 360 rubles. Test result : " + passed);
    }

}
