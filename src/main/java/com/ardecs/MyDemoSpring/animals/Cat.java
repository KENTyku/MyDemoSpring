/*
 * Use and copying for commercial purposes
 * only with the author's permission
 */
package com.ardecs.MyDemoSpring.animals;

/**
 *
 * @author Yuri Tveritin, e-mail: kentyku@bk.ru
 */
public class Cat {

    private String name = "Barsic";

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Cat speak
     */
    public void say() {
        System.out.println("Myau!");
    }
}
