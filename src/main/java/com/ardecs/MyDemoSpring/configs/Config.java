/*
 * Use and copying for commercial purposes
 * only with the author's permission
 */
package com.ardecs.MyDemoSpring.configs;

import com.ardecs.MyDemoSpring.animals.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Config {

    @Bean
    public Cat getCat() {
        return new Cat();
    }

    @Bean
    public String getString() {
        return "HELLO!";
    }
}
