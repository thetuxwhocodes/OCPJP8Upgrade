package com.invincible.ocpjp8.java8.streams.beinglazy;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Primes {

    public static boolean isPrime(final int number) {
        return number > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(number)).noneMatch(divisor -> number % divisor == 0);
    }

    public static int primeAfter(final int number) {
        return isPrime(number + 1) ? number + 1 : primeAfter(number + 1);
    }

    public static List<Integer> primes(final int fromNumber, final int count) {
        return Stream.iterate(primeAfter(fromNumber - 1), Primes::primeAfter).limit(count).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(primes(1, 1000));
        System.out.println(primes(1_000_000, 10));
        System.out.println(primes(1_000_000_000, 10000));
    }

}
