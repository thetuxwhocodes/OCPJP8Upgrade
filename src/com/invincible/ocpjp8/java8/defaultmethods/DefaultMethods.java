package com.invincible.ocpjp8.java8.defaultmethods;

import java.util.Random;

/**
 *
 * @author girish
 */


public class DefaultMethods {

    public static void main(String[] args) {

        Me me = new Me();
        System.out.println(me.getId() + " " + me.getName());

        MeMe meme = new MeMe();
        System.out.println(meme.getId() + " " + meme.getName());
    }

}

interface Person {

    int getId();

    default String getName() {
        return "Person";
    }
}

interface Named {

    default String getName() {
        return "Named";
    }

}

class Me implements Person, Named {

    @Override
    public int getId() {
        return new Random().nextInt();
    }

    @Override
    public String getName() {
        return Named.super.getName();
    }

}

class PersonImpl {

    public String getName() {
        return "PersonImpl";
    }
}

class MeMe extends PersonImpl implements Named {

    public int getId() {
        return new Random().nextInt();
    }

}
