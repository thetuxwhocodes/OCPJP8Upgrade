/*
 * Licensed to Girish B
 */

package com.invincible.ocpjp8.nested;

/**
 *
 * @author girish
 */

class LocalInnerClassTestOuterClass {
    
    private int number;
    private static String name;
    
    static {
        
        name = "Static!";
        
    }

    public LocalInnerClassTestOuterClass() {
        this(10);
    }
    
    

    public LocalInnerClassTestOuterClass(int number) {
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
        LocalInnerClassTestOuterClass.name = name;
    }
    
    public Object doSomething(final int anotherNumber){
    
        class LocalInnerClassTestInnerClass{

            private int number;

            public LocalInnerClassTestInnerClass() {
                this.number = anotherNumber;
            }

            public String toString()
            {

                return "Outer Class properties: " + LocalInnerClassTestOuterClass.name + " " + new LocalInnerClassTestOuterClass(42).number + " " + LocalInnerClassTestOuterClass.name + "\nNested Class properties: " + number;
            }
        }
        
        return new LocalInnerClassTestInnerClass();
    }
    
}


public class LocalInnerClassTest {
    
    public static void main(String[] args) {
        System.out.println(new LocalInnerClassTestOuterClass().doSomething(100));
    }
    
}

 