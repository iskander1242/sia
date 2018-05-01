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
        System.out.println("=========================");
        Instrumentalist kenny =(Instrumentalist) applicationContext.getBean("kenny");
        kenny.perform();
        System.out.println("=========================");
        Instrumentalist denny =(Instrumentalist) applicationContext.getBean("denny");
        denny.perform();
        System.out.println("==========================");
        OneManBand hank =(OneManBand) applicationContext.getBean("hank");
        hank.perform();
        applicationContext.close();
    }

    /**
     * Created by Alexander Sokolov
     * on 4/30/18.
     */
    public static class Stage {
        private Stage stage;

        private static class StageSingletonHolder{
          static Stage stage = new Stage();
        }

        private Stage(){
            System.out.println("INIT STAGE");
        }

        public static Stage getInstance(){
            return StageSingletonHolder.stage;
        }
    }
}
