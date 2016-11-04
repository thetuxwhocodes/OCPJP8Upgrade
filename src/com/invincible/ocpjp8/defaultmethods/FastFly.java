package com.invincible.ocpjp8.defaultmethods;

/**
 *
 * @author girish
 */


public interface FastFly extends Fly {

    default void takeOff() {
        System.out.println("FastFly::takeOff");
    }
}
