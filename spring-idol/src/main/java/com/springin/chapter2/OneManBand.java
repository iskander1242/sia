package com.springin.chapter2;

import java.util.Properties;

/**
 * Created by Alexander Sokolov
 * on 5/1/18.
 */
public class OneManBand implements Performer {

    Properties instruments;

    @Override
    public void perform() {
        for (String i : instruments.stringPropertyNames()) {
            System.out.println("Playing key:" + i + " play: " + instruments.getProperty(i));
        }
    }

    public Properties getInstruments() {
        return instruments;
    }

    public void setInstruments(Properties instruments) {
        this.instruments = instruments;
    }
}
