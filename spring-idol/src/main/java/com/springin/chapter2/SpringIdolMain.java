package com.springin.chapter2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Alexander Sokolov
 * on 4/30/18.
 */
public class SpringIdolMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:spring-idol.xml");
        Juggler duke = (Juggler) applicationContext.getBean("duke");
        duke.perform();
        Juggler poeticDuke = (PoeticJuggler) applicationContext.getBean("poeticJuggler");
        poeticDuke.perform();

        applicationContext.close();
    }
}
