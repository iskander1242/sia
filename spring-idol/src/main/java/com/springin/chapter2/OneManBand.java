package com.springin.chapter2;

import java.util.Collection;

/**
 * Created by Alexander Sokolov
 * on 5/1/18.
 */
public class OneManBand  implements Performer{

    Collection<Instrument> instruments;
    @Override
    public void perform() {
        for (Instrument i :instruments){
            i.play();
        }
    }

    public Collection<Instrument> getInstruments() {
        return instruments;
    }

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }
}
