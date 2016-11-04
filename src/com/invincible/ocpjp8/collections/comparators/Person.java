package com.invincible.ocpjp8.collections.comparators;

/**
 *
 * @author girish
 */


public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int ageDiff(Person other) {
        return age - other.getAge();
    }

    @Override
    public String toString() {
        return name + " - " + age;
    }


}
