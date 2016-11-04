/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invincible.ocpjp8.java8.streams;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GirishB
 */
public class StreamTest {
    
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Man Utd");
        myList.add("Chelsea");
        myList.add("Man City");
        myList.add("Real Madrid");
        myList.add("Barcelona");
        myList.add("PSV");
        
        //Sort and Print
        myList.stream().sorted().forEach(System.out::println);
        System.out.println();
        
        //Find all that starts with 'M'
        myList.stream().filter((s) -> s.startsWith("M")).forEach(System.out::println);
        System.out.println();
        
        // Convert to Upper case and print all delimited by a comma --> Map-Reduce
        myList.stream().map((s) -> s.toUpperCase()).reduce((s1, s2) -> s1 + "," + s2).ifPresent(System.out::println);
        System.out.println();
        
    }
    
}
