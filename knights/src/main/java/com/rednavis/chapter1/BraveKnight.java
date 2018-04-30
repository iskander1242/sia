package com.rednavis.chapter1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Alexander Sokolov
 * on 4/23/18.
 */
public class BraveKnight {
    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public BraveKnight() {
    }

    @PostConstruct
    public void initIt() throws Exception {
        System.out.println("Init method after properties are set : " + quest.toString());
    }

    @PreDestroy
    public void cleanUp() throws Exception {
        System.out.println("+++Spring Container is destroy! Customer clean up");
    }

    public void embarkOnQuest(){
        quest.embark();
    }
}
