package com.invincible.ocpjp8.generics;

/**
 *
 * @author girish
 */
public class Generics101 {

    public static void main(String[] args) {

        Pair<Integer, String> pair = new Pair<>(123, "Girish");

        System.out.println(pair.getObj1());
        System.out.println(pair.getObj2());

    }

}

class Pair<T1, T2> {

    T1 obj1;
    T2 obj2;

    Pair(T1 obj1, T2 obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    T1 getObj1() {
        return obj1;
    }

    T2 getObj2() {
        return obj2;
    }
}
