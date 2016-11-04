/*
 * Licensed to Girish B
 */

package com.invincible.ocpjp8.nested;

/**
 *
 * @author girish
 */

class InnerClassTestOuterClass {
    
    private int number;
    private static String name;
    
    static {
        
        name = "Static!";
        
    }

    public InnerClassTestOuterClass() {
    }
    
    

    public InnerClassTestOuterClass(int number) {
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
        InnerClassTestOuterClass.name = name;
    }
    
    public void print()
    {
        this.new InnerClassTestInnerClass(number*number).print();
    }
    
    class InnerClassTestInnerClass{
        
        private int number;
        
        public InnerClassTestInnerClass(int number) {
            this.number = number;
        }
        
        public void print()
        {
            
            System.out.println("Outer Class properties: " + InnerClassTestOuterClass.name + " " + new InnerClassTestOuterClass(42).number + " " + InnerClassTestOuterClass.name);
            System.out.println("Nested Class properties: " + number);
        }
    }
    
}


public class InnerClassTest {
    
    public static void main(String[] args) {
        new InnerClassTestOuterClass().new InnerClassTestInnerClass(42*42*42).print();
        new InnerClassTestOuterClass(5).print();
    }
    
}

 