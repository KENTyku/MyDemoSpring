package com.ardecs.MyDemoSpring;

import com.ardecs.MyDemoSpring.animals.Cat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Using beans
 * @author Yuri Tveritin, e-mail: kentyku@bk.ru
 */

@SpringBootApplication
public class MyDemoSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyDemoSpringApplication.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext(""
                + "com.ardecs.MyDemoSpring.configs");//create context of beans
        Cat cat = context.getBean(Cat.class);//return bean of class Cat and create object Cat
        System.out.println(cat.getName());
        cat.say();
        
        System.out.println(context.getBean(String.class));//return bean of class String
    }
}
