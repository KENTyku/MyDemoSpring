package com.ardecs.MyDemoSpring;

import com.ardecs.MyDemoSpring.animals.Cat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyDemoSpringApplicationTests {
    @Autowired
    Cat cat;
    @Autowired
    String string;

    @Test
    public void contextLoads() {
        cat.say();
        System.out.println(string);
    }

}
