/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invincible.ocpjp8.java8;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author Girish
 */
public class Basics {

    public static void main(String[] args) {

        List<BigDecimal> prices = Arrays.asList(new BigDecimal("10"), new BigDecimal("20"), new BigDecimal("30"), new BigDecimal("40"), new BigDecimal("50"), new BigDecimal("60"), new BigDecimal("70"));

        final Predicate<BigDecimal> priceAbove20 = price -> price.compareTo(BigDecimal.valueOf(20)) > 0;

        BigDecimal total = prices.stream()
                .filter(priceAbove20)
                .map(price -> price.multiply(BigDecimal.valueOf(0.9)))
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println(total);

        List<BigDecimal> discountedPrices = prices.stream()
                .filter(priceAbove20)
                .map(price -> price.multiply(BigDecimal.valueOf(0.9)))
                .collect(Collectors.toList());

        System.out.println(discountedPrices);

        prices.stream()
                .filter(priceAbove20)
                .map(price -> price.multiply(BigDecimal.valueOf(0.5)))
                .forEach(System.out::println);

        List<BigDecimal> none = prices.stream()
                .filter(price -> price.compareTo(BigDecimal.valueOf(80)) > 0)
                .map(price -> price.multiply(BigDecimal.valueOf(0.9)))
                .collect(Collectors.toList());

        System.out.println(none);

        System.out.println("Above 30");
        prices.stream()
                .filter(priceAboveLimit(30))
                //.map(price -> price.multiply(BigDecimal.valueOf(0.5)))
                .forEach(System.out::println);

        System.out.println("Above 40");
        prices.stream()
                .filter(priceAboveLimit(40))
                //.map(price -> price.multiply(BigDecimal.valueOf(0.5)))
                .forEach(System.out::println);
        
        
       final Function<Integer, Predicate<BigDecimal>> priceAbove = limit -> price -> (price.compareTo(BigDecimal.valueOf(limit)) > 0); 
       
       System.out.println("Above 50");
       prices.stream()
                .filter(priceAbove.apply(50))
                //.map(price -> price.multiply(BigDecimal.valueOf(0.5)))
                .forEach(System.out::println);

        Optional<BigDecimal> max = prices.stream().reduce((p1, p2) -> p1.compareTo(p2) > 0 ? p1 : p2);
        System.out.println("Max = " + max.get());

    }

    static Predicate<BigDecimal> priceAboveLimit(final int limit) {
        return (price -> price.compareTo(BigDecimal.valueOf(limit)) > 0);
    }
    
    

}
