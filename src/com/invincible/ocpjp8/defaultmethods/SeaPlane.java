package com.invincible.ocpjp8.defaultmethods;

/**
 *
 * @author girish
 */


public class SeaPlane extends Vehicle implements FastFly, Sail {

    public void cruise() {
        System.out.println("SeaPlane::cruise");
    }

    public static void main(String[] args) {
        SeaPlane seaPlane = new SeaPlane();

        seaPlane.takeOff();
        seaPlane.turn();
        seaPlane.cruise();
        seaPlane.land();
    }

}
