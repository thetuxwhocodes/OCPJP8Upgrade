/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invincible.ocpjp8.java8.streams;

import java.util.stream.Stream;

/**
 *
 * @author girish
 */
public class StreamStuff {
    
    public static void main(String[] args) {
        synchronized(System.out){
            System.out.println("Hello World!");
            //IntStream.range(0, 5).parallel().forEach(System.out::println);

            Stream<Double> randoms = Stream.generate(Math::random);
            System.out.println(randoms);
        }
    }
    
}
