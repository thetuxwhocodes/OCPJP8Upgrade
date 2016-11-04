package com.invincible.ocpjp8.java8;

public class FunctionalInterfaceTest {

    public static void main(String[] args) {
        Converter<Integer, Integer> RsToPaisaConverter = (from) -> from * 100;
        Integer paisa = RsToPaisaConverter.convert(123);
        System.out.println(paisa);    

        Converter<Integer, Double> InchToCmConverter = (from) -> from * 2.5;
        Double cms = InchToCmConverter.convert(123);
        System.out.println(cms);    
    }
}

@FunctionalInterface
interface Converter<F, T> {

    T convert(F from);
}
