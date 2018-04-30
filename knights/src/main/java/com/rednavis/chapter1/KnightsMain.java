package com.rednavis.chapter1;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by Alexander Sokolov
 * on 4/23/18.
 */
public class KnightsMain {
    public static void main(String[] args) {
            ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:knights.xml");
            BraveKnight braveKnight = (BraveKnight) applicationContext.getBean("knight");
            braveKnight.embarkOnQuest();
            applicationContext.close();
    }
}
