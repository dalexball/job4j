package ru.job4j.search;

import java.util.ArrayList;

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
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : this.persons) {
            if (person.getName().equals(key) ||
                    person.getAddress().equals(key) ||
                    person.getPhone().equals(key) ||
                    person.getSurname().equals(key)) {
                result.add(person);
            }
        }
        return result;
    }
}
