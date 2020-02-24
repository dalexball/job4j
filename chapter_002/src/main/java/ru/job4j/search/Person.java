package ru.job4j.search;

/**
 * Class models person
 *
 * @author Alex Dotsyak
 * @version 1
 * @since 0.1
 */

public class Person {

    /**
     * Persons identifiers: name, surname, phone number, adress
     */
    private String name;
    private String surname;
    private String phone;
    private String address;

    public Person(String name, String surname, String phone, String address) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.address = address;
    }

    /**
     * Getter for name
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for surname
     *
     * @return surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Getter for phone number
     *
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Getter for adress
     *
     * @return adress
     */
    public String getAddress() {
        return address;
    }
}
