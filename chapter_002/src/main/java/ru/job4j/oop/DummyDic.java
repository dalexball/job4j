package ru.job4j.oop;

/**
 * Class models dummy translator
 *
 * @author Alex Dotsyak
 * @version 1
 */
public class DummyDic {

    /**
     * Translates word from eng to rus (actually, it doesn't)
     *
     * @param eng - word in english
     * @return word in russian
     */
    public String engToRus(String eng) {
        return ("Неизвестное слово. " + eng);
    }

    public static void main(String[] args) {
        DummyDic dummyDic = new DummyDic();
        System.out.println(dummyDic.engToRus("roflan"));
    }
}
