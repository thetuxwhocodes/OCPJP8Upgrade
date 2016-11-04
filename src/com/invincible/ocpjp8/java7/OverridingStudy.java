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
public class OverridingStudy {
    
    public static void main(String[] args) {
        
        Circle c1 = new Circle(5, 100, 5);
        Circle c2 = c1.copy();
        
    }
    
}


class Shape
{
    
    public double area()
    {
        return 0;
    }
    
    public Shape copy()
    {
        return this;
    }
}

class Circle extends Shape
{
    int x, y, radius;

    public Circle(int x, int y, int r) {
        
        this.x = x;
        this.y = y;
        radius = r;
    }
    
    @Override
    public double area()
    {
        return Math.PI * radius * radius;
    }
    
    @Override
    public Circle copy()
    {
        return this;
    }
    
    
}
