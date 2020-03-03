package ru.job4j.collection;

import java.util.Objects;

/**
 * Class models user
 *
 * @author Alex Dotsyak
 * @version 1
 * @since 0.1
 */
public class User implements Comparable<User> {

    /**
     * Name and age of user
     */
    private String name;
    private int age;


    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    /**
     * Compare this user to input user
     *
     * @param o - input user
     * @return 0 if this = o, >0 if this > o, <0 if this < o
     */
    @Override
    public int compareTo(User o) {
        int value = this.name.compareTo(o.name);
        if (value == 0) {
            value = age - o.age;
        }
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return age == user.age
                && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

}
