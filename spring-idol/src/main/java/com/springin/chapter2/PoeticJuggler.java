package com.springin.chapter2;

/**
 * Created by Alexander Sokolov
 * on 4/30/18.
 */
public class PoeticJuggler  extends  Juggler{

    private Poem poem;

    PoeticJuggler(int beanBags, Poem poem){
        super(beanBags);
        this.poem=poem;
    }
    @Override
    public void perform(){
        super.perform();
        System.out.println("POEM RECITE");
        poem.recite();
    }
}
