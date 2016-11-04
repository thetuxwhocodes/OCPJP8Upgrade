package com.invincible.ocpjp8.java8.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author girish
 */


public class ComparatorsUsingLambda {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        List<String> strings2 = new ArrayList<>();
        List<String> strings3 = new ArrayList<>();
        List<String> strings4 = new ArrayList<>();

        strings.add("x");
        strings.add("ab");
        strings.add("sdf");
        strings.add("ewdd");
        strings.add("a");

        System.out.println("strings - Original = " + strings);

        strings2.addAll(strings);
        strings3.addAll(strings);
        strings4.addAll(strings);

        //Legacy non-Lambda way of using a Comparator instance
        Collections.sort(strings, new LengthComparator());
        System.out.println("strings - Sorted = " + strings);

        System.out.println("strings2 - Original = " + strings2);

        //New Lambda way of passing the code
        Collections.sort(strings2, (first, second) -> Integer.compare(first.length(), second.length()));
        System.out.println("strings2 - Sorted = " + strings2);

        System.out.println("strings3 - Original = " + strings3);

        //New Lambda way of passing the code
        Collections.sort(strings3, String::compareToIgnoreCase);
        System.out.println("strings3 - Sorted = " + strings3);

//        System.out.println("strings4 - Original = " + strings4);
//
//        Collections.sort(strings4, (first, second) -> Comparator<String>.compare(String::length
//        ));
//        System.out.println("strings4 - Sorted = " + strings4);

    }

}

class LengthComparator implements Comparator<String> {

    @Override
    public int compare(String first, String second) {
        return Integer.compare(first.length(), second.length());
    }
}
