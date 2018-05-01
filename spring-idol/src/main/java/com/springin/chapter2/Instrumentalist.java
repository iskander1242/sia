package com.springin.chapter2;

/**
 * Created by Alexander Sokolov
 * on 5/1/18.
 */
public class Instrumentalist implements Performer{
    public String song;
    public Instrument instrument;


    @Override
    public void perform() {
        System.out.println("PLaying song: "+song);
        instrument.play();
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
