package com.springin.chapter2;

/**
 * Created by Alexander Sokolov
 * on 5/1/18.
 */
public class Saxophone implements Instrument {
    @Override
    public void play() {
        System.out.printf("TOOT TOOT TOOT");
    }
}
