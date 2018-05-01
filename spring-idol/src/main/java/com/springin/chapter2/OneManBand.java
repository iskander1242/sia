package com.springin.chapter2;

import java.util.Map;

/**
 * Created by Alexander Sokolov
 * on 5/1/18.
 */
public class OneManBand implements Performer {

    Map<String, Instrument> instruments;

    @Override
    public void perform() {
        for (String i : instruments.keySet()) {
            System.out.println("Playing key:" + i);
            instruments.get(i).play();
        }
    }

    public Map<String, Instrument> getInstruments() {
        return instruments;
    }

    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }
}
