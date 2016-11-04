/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.invincible.ocpjp8.java7;

/**
 *
 * @author girish
 */
public class StaticBlockTrials {
    
    public static void main(String[] args) {
        
        System.out.println("Main starts here!");
        
        DEF def = new DEF();
        System.out.println(DEF.getCount());

        DEF def2 = new DEF();
        System.out.println(DEF.getCount());
}
    
}

class DEF {
    
    private static int count;
    
    static{
        
        System.out.println("In static Block");
    }
    
    DEF()
    {
        
        System.out.println("In DEF Constructor~");
        count++;

    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        DEF.count = count;
    }
    
    
    
}
