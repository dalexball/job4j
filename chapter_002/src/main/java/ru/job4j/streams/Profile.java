package ru.job4j.streams;

/**
 * Class models profile that contains address
 *
 * @author Alex Dotsyak
 * @version 1
 * @since 1
 */
public class Profile {

    public Profile(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    private Address address;

}
