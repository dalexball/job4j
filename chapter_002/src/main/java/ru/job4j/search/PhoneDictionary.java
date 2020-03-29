package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * Class models phone dictionary
 *
 * @author Alex Dotsyak
 * @version 1
 * @since 0.1
 */
public class PhoneDictionary {

    /**
     * List of people, that this phone dictionary contain
     */
    private ArrayList<Person> persons = new ArrayList<>();

    /**
     * Adds person to dictionary
     *
     * @param person - person
     */
    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Searches for people, who have name/surname/phone/address equal to key
     *
     * @param key - key
     * @return list of people
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> combineName = s -> s.getName().equals(key);
        Predicate<Person> combinePhone = s -> s.getPhone().equals(key);
        Predicate<Person> combineSurname = s -> s.getSurname().equals(key);
        Predicate<Person> combineAddress = s -> s.getAddress().equals(key);
        var resultPredicate = combineName.or(combinePhone.or(combineSurname.or(combineAddress)));

        ArrayList<Person> result = new ArrayList<>();
        for (var person : persons) {
            if (resultPredicate.test(person)) {
                result.add(person);
            }
        }
        return result;
    }

}
