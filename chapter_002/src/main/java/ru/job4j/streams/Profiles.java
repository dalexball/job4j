package ru.job4j.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class gets list of distinct sorted addresses from profiles list
 *
 * @author Alex Dotsyak
 * @version 1
 * @since 1
 */
public class Profiles {

    /**
     * Collects addresses of profiles, leaving only distinct and sorting by city name
     *
     * @param profiles - list of input profiles
     * @return list of addresses
     */
    public List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::getAddress)
                .sorted(Comparator.comparing(Address::getCity))
                .distinct()
                .collect(Collectors.toList());
    }

}
