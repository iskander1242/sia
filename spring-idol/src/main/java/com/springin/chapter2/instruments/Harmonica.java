package com.springin.chapter2.instruments;

import com.springin.chapter2.Instrument;

/**
 * Created by Alexander Sokolov
 * on 5/1/18.
 */
public class Harmonica implements Instrument {
    @Override
    public void play() {
        System.out.println("HUM HUM HUM");
    }
}
