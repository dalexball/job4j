package ru.job4j.collection;

import java.util.*;

/**
 * Class models departments
 *
 * @author Alex Dotsyak
 * @version 1
 * @since 0.1
 */
public class Departments {

    /**
     * Fills missing gaps in departments
     *
     * @param deps - departments
     * @return full list
     */
    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        for (String value : deps) {
            List<String> split = Arrays.asList(value.split("/"));
            String start = split.get(0);
            tmp.add(start);
            for (String el : split) {
                if (!el.equals(start)) {
                    start += "/" + el;
                }
                tmp.add(start);
            }
        }

        ArrayList<String> list = new ArrayList<>(tmp);
        sortAsc(list);
        return list;
    }

    /**
     * Sorts input list by ascending
     *
     * @param orgs - organizations
     */
    public static void sortAsc(List<String> orgs) {
        orgs.sort(Comparator.naturalOrder());
    }

    /**
     * Sorts input list by descending
     *
     * @param orgs - organizations
     */
    public static void sortDesc(List<String> orgs) {
        orgs.sort(Comparator.reverseOrder());
    }
}
