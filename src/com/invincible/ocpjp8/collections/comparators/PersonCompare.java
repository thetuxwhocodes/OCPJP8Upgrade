package com.invincible.ocpjp8.collections.comparators;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;



public class PersonCompare {

    public static void main(String[] args) {
        final List<Person> people = Arrays.asList(
                new Person("Sachin", 41),
                new Person("Kambli", 41),
                new Person("Saurav", 42),
                new Person("Rahul", 40),
                new Person("VVS", 39)
        );

        System.out.println("Original : " + people);

        List<Person> sortedOnAgeAsc1 = people.stream().sorted((person1, person2) -> person1.ageDiff(person2)).collect(toList());
        System.out.println("Ascending Age 1 : " + sortedOnAgeAsc1);

        List<Person> sortedOnAgeAsc2 = people.stream().sorted(Person::ageDiff).collect(toList());
        System.out.println("Ascending Age 2 : " + sortedOnAgeAsc2);

        List<Person> sortedOnAgeDesc1 = people.stream().sorted((person1, person2) -> person2.ageDiff(person1)).collect(toList());
        System.out.println("Descending Age 1 : " + sortedOnAgeDesc1);

        Comparator<Person> compareAsc = (person1, person2) -> person1.ageDiff(person2);

        List<Person> sortedOnAgeAsc3 = people.stream().sorted(compareAsc).collect(toList());
        System.out.println("Ascending Age 3 : " + sortedOnAgeAsc3);

        Comparator<Person> compareDesc = compareAsc.reversed();

        List<Person> sortedOnAgeDesc2 = people.stream().sorted(compareDesc).collect(toList());
        System.out.println("Descending Age 2 : " + sortedOnAgeDesc2);

        Comparator<Person> compareNameAsc = (person1, person2) -> person1.getName().compareTo(person2.getName());

        List<Person> sortedOnNameAsc1 = people.stream().sorted(compareNameAsc).collect(toList());
        System.out.println("Ascending Name 1 : " + sortedOnNameAsc1);

        Comparator<Person> compareNameDesc = compareNameAsc.reversed();

        List<Person> sortedOnNameDesc1 = people.stream().sorted(compareNameDesc).collect(toList());
        System.out.println("Descending Name 1 : " + sortedOnNameDesc1);

        people.stream().min(Person::ageDiff).ifPresent(youngest -> System.out.println("Youngest  : " + youngest));
        people.stream().max(Person::ageDiff).ifPresent(eldest -> System.out.println("Eldest  : " + eldest));

        final Function<Person, String> byName = person -> person.getName();
        final Function<Person, Integer> byAge = person -> person.getAge();

        List<Person> sortedOnAgeAsc4 = people.stream().sorted(Comparator.comparing(byAge)).collect(toList());
        System.out.println("Ascending Age 4 : " + sortedOnAgeAsc4);

        List<Person> sortedOnNameAsc2 = people.stream().sorted(Comparator.comparing(byName)).collect(toList());
        System.out.println("Ascending Name 2 : " + sortedOnNameAsc2);

        List<Person> sortedOnAgeAndNameAsc1 = people.stream().sorted(Comparator.comparing(byAge).thenComparing(byName)).collect(toList());
        System.out.println("Ascending Age and Name 1 : " + sortedOnAgeAndNameAsc1);

        Map<Integer, List<Person>> groupedByAge1 = people.stream().collect(groupingBy(byAge));
        System.out.println("Grouped By Age 1 : " + groupedByAge1);

        Map<Integer, List<String>> groupedByAge2 = people.stream().collect(groupingBy(byAge, mapping(byName, toList())));
        System.out.println("Grouped By Age 2 : " + groupedByAge2);

    }

}
