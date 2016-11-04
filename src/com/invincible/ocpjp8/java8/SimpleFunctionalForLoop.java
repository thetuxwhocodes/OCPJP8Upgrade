package com.invincible.ocpjp8.java8;

import java.util.ArrayList;
import java.util.List;

public class SimpleFunctionalForLoop {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();

        //Insert the numbers 1 to 5 to the list
        for (int i = 0; i < 5; i++) {
            integers.add(i + 1);
        }

        //Normal printing using toString of ArrayList
        System.out.println("Normal printing using toString of ArrayList: ");
        System.out.println(integers);
        System.out.println();

        //Normal for-each iteration and printing the values one by one
        System.out.println("Normal foreach iteration and printing the values one by one: ");
        for (int i : integers) {
            System.out.println(i);
        }
        System.out.println();

        //Using the new Java 8 Functional Notation for for-each iteration
        System.out.println("Using the new Java 8 Functional Notation for for-each iteration: ");
        integers.stream().forEach((i) -> {
            System.out.println(i);
        });
        System.out.println();

    }
    
    

}
