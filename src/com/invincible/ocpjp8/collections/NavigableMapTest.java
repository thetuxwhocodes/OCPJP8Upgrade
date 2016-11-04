
package com.invincible.ocpjp8.collections;

import java.util.NavigableMap;
import java.util.TreeMap;

/**
 *
 * @author girish
 */


public class NavigableMapTest {
    
    public static void main(String[] args){
        NavigableMap<Integer, String> nMap = new TreeMap<>();
        
        nMap.put(10, "A");
        nMap.put(20, "B");
        nMap.put(60, "F");
        nMap.put(30, "C");
        nMap.put(70, "G");
        nMap.put(40, "D");
        nMap.put(50, "E");
        
        System.out.println(nMap);
        System.out.println(nMap.headMap(30));
        System.out.println(nMap.tailMap(30));
 
        System.out.println(nMap.firstEntry());
        System.out.println(nMap.lastEntry());
        
        System.out.println(nMap.higherEntry(40));
        System.out.println(nMap.lowerEntry(40));
        
    }
    
}
