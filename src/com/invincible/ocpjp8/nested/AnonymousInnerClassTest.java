/*
 * Licensed to Girish B
 */

package com.invincible.ocpjp8.nested;

/**
 *
 * @author girish
 */

class AnonymousInnerClassTestOuterClass {
    
    private int number;
    private static String name;
    
    static {
        name = "Static!";
    }

    public AnonymousInnerClassTestOuterClass() {
        this(10);
    }
    
    public AnonymousInnerClassTestOuterClass(int number) {
        this.number = number;
        name = "Outer";
    }
    
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        AnonymousInnerClassTestOuterClass.name = name;
    }
    
    public Object doSomething(final int anotherNumber){
    
        class AnonymousInnerClassTestInnerClass{

            private int number;

            public AnonymousInnerClassTestInnerClass() {
                this.number = anotherNumber;
            }

            @Override
            public String toString()
            {

                return "Outer Class properties: " + AnonymousInnerClassTestOuterClass.name + " " + new AnonymousInnerClassTestOuterClass(42).number + " " + AnonymousInnerClassTestOuterClass.name + "\nNested Class properties: " + number;
            }
        }
        
        return new AnonymousInnerClassTestInnerClass(){

            @Override
            public String toString() {
                return "From Anonymous: \n" + super.toString(); 
            }
        };
    }
}

public class AnonymousInnerClassTest {
    
    public static void main(String[] args) {
        System.out.println(new AnonymousInnerClassTestOuterClass().doSomething(100));
    }
    
}

 