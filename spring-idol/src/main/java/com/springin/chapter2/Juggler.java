package com.springin.chapter2;

/**
 * Created by Alexander Sokolov
 * on 4/30/18.
 */
public class Juggler implements Performer {
    private int beanBags = 3;

    public Juggler() {
    }

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    public void perform() {
        System.out.println(toString().toUpperCase()+" JUGGLING " + beanBags + " BEANBAGS");
    }
}
