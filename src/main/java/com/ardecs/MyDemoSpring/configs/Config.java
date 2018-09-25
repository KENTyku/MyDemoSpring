/*
 * Use and copying for commercial purposes
 * only with the author's permission
 */
package com.ardecs.MyDemoSpring.configs;

import com.ardecs.MyDemoSpring.animals.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * A class that describes the process of creating objects in an application.
 *
 * @author Yuri Tveritin, e-mail: kentyku@bk.ru
 */
@Configuration
public class Config {

    /**
     * Create new object Cat
     *
     * @return
     */
    @Bean
    public Cat getCat() {
        return new Cat();
    }

    /**
     * Create new object String
     *
     * @return
     */
    @Bean
    public String getString() {
        return "HELLO!";
    }
}
