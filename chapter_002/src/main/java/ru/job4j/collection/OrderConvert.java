package ru.job4j.collection;

import java.util.HashMap;
import java.util.List;

/**
 * Class converts list of orders to map of orders
 *
 * @author Alex Dotsyak
 * @version 1
 * @since 0.1
 */
public class OrderConvert {

    /**
     * Converts list of orders to map
     *
     * @param orders - list of orders
     * @return map
     */
    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();
        for (Order order : orders) {
            map.put(order.getNumber(), order);
        }
        return map;
    }
}