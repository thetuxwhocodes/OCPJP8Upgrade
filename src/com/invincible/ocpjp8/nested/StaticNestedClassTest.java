package com.invincible.ocpjp8.nested;

/**
 *
 * @author girish
 */
class OuterClass {
    
    private int number;
    private static String name;
    
    static {
        
        name = "Static!";
        
    }

    public OuterClass(int number) {
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
        OuterClass.name = name;
    }
    
    static class StaticNestedClass{
        
        private int number;

        public StaticNestedClass(int number) {
            this.number = number;
        }
        
        public void print()
        {
            
            System.out.println("Outer Class properties: " + OuterClass.name + " " + new OuterClass(42).number + " " + OuterClass.name);
            System.out.println("Nested Class properties: " + number);
        }
    }
    
}

public class StaticNestedClassTest
{
    
    public static void main(String[] args) {
        
      new OuterClass.StaticNestedClass(42*42).print();
    }
}